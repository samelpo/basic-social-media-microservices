package uk.ac.york.eng2.videos.controllers;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.VideoDTO;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
import uk.ac.york.eng2.videos.repositories.VideosRepository;

@Controller("/videos")
public class VideosController {

	@Inject
	VideosRepository repo;
	
	@Inject
	UsersRepository userRepo;
	
	@Get("/")
	public Iterable<Video> list() {
		return repo.findAll();
	}
	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO videoDetails) {
		
		Optional<User> optionalUser = userRepo.findById(videoDetails.getCreatorId());
        if (optionalUser.isPresent()) {
            User creator = optionalUser.get();
            
            Video video = new Video();
    		video.setTitle(videoDetails.getTitle());
    		video.setCreator(creator);
    		video.setHashtags(videoDetails.getHashtags());
    		
    		repo.save(video);
    		
    		return HttpResponse.created(URI.create("/videos/" + video.getId()));
        } else {
        	return HttpResponse.notFound();
        }
		

	}
	@Get("/{videoId}/viewers")
	public Iterable<User> getViewers(long videoId) {
		Optional<Video> oVideo = repo.findById(videoId);
		if (oVideo.isEmpty()) {
			return null;
		}
		return oVideo.get().getViewers();
	}
	
    @Transactional
	@Put("/{videoId}/viewer/{userId}")
	public HttpResponse<String> addViewer(long videoId, long userId) {
		Optional<Video> oVideo = repo.findById(videoId);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %d not found", videoId));
		}

		Optional<User> oUser = userRepo.findById(userId);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %d not found", userId));
		}
		
		Video video = oVideo.get();
		User user = oUser.get();
		if (video.getViewers().add(user)) {
			video.setViewed(true);
			user.getViewedVideos().add(video);
			repo.update(video);
			userRepo.update(user);
			//producer.viewerWatched(videoId, video);
		}
		

		return HttpResponse.ok(String.format("User %d added as viewer of video %d", userId, videoId));
	}
	
    @Transactional
    @Put("/{videoId}/likes")
	public HttpResponse<String> addLike(long videoId) {
    	Optional<Video> oVideo = repo.findById(videoId);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %d not found", videoId));
		}
		
		Video video = oVideo.get();
		
		video.addLike();
		repo.update(video);
		
		return HttpResponse.ok(String.format("Liked video %d", videoId));

    }
    @Transactional
    @Put("/{videoId}/dislikes")
	public HttpResponse<String> addDislike(long videoId) {
    	Optional<Video> oVideo = repo.findById(videoId);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %d not found", videoId));
		}
		Video video = oVideo.get();
		
		video.addDislike();
		repo.update(video);
		return HttpResponse.ok(String.format("Disliked video %d", videoId));

    }
}
