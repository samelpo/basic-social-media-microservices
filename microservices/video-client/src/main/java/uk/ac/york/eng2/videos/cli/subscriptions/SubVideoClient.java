package uk.ac.york.eng2.videos.cli.subscriptions;

import java.util.List;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Client("${users.url:`http://localhost:8082/videos`}")
public interface SubVideoClient {

	@Get("/")
	Iterable<Video> list();
	
	@Get("/top")
	public List<Video> TopVideos(@QueryValue(defaultValue="10") int n);
	
	@Get("/hashtags")
	public List<Video> hashtagRecommendedVideos(String hashtag);
}
