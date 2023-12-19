package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;
import uk.ac.york.eng2.videos.cli.domain.User;

@Client("${videos.url:`http://localhost:8080/videos`}")
public interface VideosClient {

	@Get("/")
	public Iterable<Video> list();
	
	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO videoDetails);
	
	@Get("/{videoId}/viewers")
	public Iterable<User> getViewers(long videoId);
	
	@Put("/{videoId}/viewer/{userId}")
	public HttpResponse<String> addViewer(long videoId, long userId);
	
	@Put("/{videoId}/likes/{userId}")
	public HttpResponse<String> addLike(long videoId, long userId);
	
	@Put("/{videoId}/dislikes/{userId}")
	public HttpResponse<String> addDislike(long videoId, long userId);
}
