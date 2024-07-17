package uk.ac.york.eng2.subscription.controllers;

import java.util.List;

import io.micronaut.data.model.Pageable;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.repositories.VideoRepository;

@Controller("/videos")
public class VideoController {

	@Inject
	VideoRepository repo;
	
	@Get("/")
	public Iterable<Video> list() {
		return repo.findAll();
	}
	
	@Get("/top")
	public List<Video> TopVideos(@QueryValue(defaultValue="10") int n) {
		return repo.findOrderByLikeCountDesc(Pageable.from(0, n));
	}
	@Get("/hashtags")
	public List<Video> hashtagRecommendedVideos(String hashtag) {
		return repo.findByHashtagOrderByLikeCountDesc(hashtag);
	}
	
}
