package uk.ac.york.eng2.videos.cli.trending;

import java.util.List;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;

@Client("${videos.url:`http://localhost:8081/hashtags`}")
public interface TrendingClient {

	@Get("/")
	public Iterable<Hashtag> list();
	
	@Get("/{id}")
	public Hashtag getHashtag(Long id);
	
	@Get("/top10")
	public List<Hashtag> topTenHashtags();
}
