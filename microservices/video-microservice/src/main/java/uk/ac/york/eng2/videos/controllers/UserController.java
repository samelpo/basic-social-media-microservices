package uk.ac.york.eng2.videos.controllers;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.UserDTO;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
import uk.ac.york.eng2.videos.repositories.VideosRepository;

@Controller("/users")
public class UserController {

	@Inject
	VideosRepository videoRepo;
	
	@Inject
	UsersRepository repo;
	
	@Get("/")
	public Iterable<User> list() {
		return repo.findAll();
	}

	@Post("/")
	public HttpResponse<Void> add(@Body UserDTO userDetails) {
		User user = new User();
		user.setUsername(userDetails.getUsername());
		repo.save(user);
		return HttpResponse.created(URI.create("/users/" + user.getId()));
	}

	@Get("/{id}")
	public UserDTO getUser(long id) {
		return repo.findOne(id).orElse(null);
	}
	
	@Get("/{userId}/viewedVideos")
	public Iterable<Video> getViewed(long userId){
		Optional<User> optionalUser = repo.findById(userId);
		if (optionalUser.isEmpty()) {
			return null;
		}
		return optionalUser.get().getViewedVideos();
	}
	@Transactional
	@Put("/{videoId}/viewer/{userId}")
	public HttpResponse<String> addViewer(long videoId, long userId) {
		Optional<Video> oVideo = videoRepo.findById(videoId);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %d not found", videoId));
		}

		Optional<User> oUser = repo.findById(userId);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %d not found", userId));
		}
		
		Video video = oVideo.get();
		User user = oUser.get();
		if (user.getViewedVideos().add(video)) {
			repo.update(user);
		}
		

		return HttpResponse.ok(String.format("User %d added as viewer of video %d", userId, videoId));
	}

	@Transactional
	@Put("/{id}")
	public HttpResponse<Void> updateUser(long id, @Body UserDTO userDetails) {
		Optional<User> user = repo.findById(id);
		if (user.isEmpty()) {
			return HttpResponse.notFound();
		}

		User u = user.get();
		if (userDetails.getUsername() != null) {
			u.setUsername(userDetails.getUsername());
		}
		repo.save(u);
		return HttpResponse.ok();
	}

	@Transactional
	@Delete("/{id}")
	public HttpResponse<Void> deleteUser(long id) {
		Optional<User> user = repo.findById(id);
		if (user.isEmpty()) {
			return HttpResponse.notFound();
		}

		repo.delete(user.get());
		return HttpResponse.ok();
	}

}
