package uk.ac.york.eng2.videos.cli.subscriptions;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.dto.UserDTO;

@Client("${users.url:`http://localhost:8082/users`}")
public interface SubClient {
	
	@Get("/")
	Iterable<User> list();
	
	@Get("/{id}")
	User getUser(Long id);

	@Put("/{userId}/subbedTo/{hashtag}")
	public HttpResponse<String> addSubscription(String hashtag, Long userId);
	
	@Delete("/{userId}/subbedTo/{hashtag}")
	public HttpResponse<String> removeSubscription(String hashtag, long userId);
}
