package uk.ac.york.eng2.subscription.controllers;

import java.util.Optional;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.domain.User;
import uk.ac.york.eng2.subscription.events.SubscriptionProducer;
import uk.ac.york.eng2.subscription.repositories.UserRepository;

@Controller("/users")
public class UserController {

	@Inject
	UserRepository repo;
	
	@Inject
	SubscriptionProducer producer;
	
	@Get("/")
	public Iterable<User> list() {
		return repo.findAll();
	}
	
	@Transactional
	@Put("/{userId}/subbedTo/{hashtag}")
	public HttpResponse<String> addSubscription(String hashtag, long userId){
		Optional<User> oUser = repo.findById(userId);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %d not found", userId));
		}
		
		User user = oUser.get();
		user.addSubbedTo(hashtag);
		
		producer.userSubscribedToHashtag(userId, hashtag);
		
		return HttpResponse.ok(String.format("User subbed to %s%n", hashtag));
	}
	
	@Transactional
	@Delete("/{userId}/subbedTo/{hashtag}")
	public HttpResponse<String> removeSubscription(String hashtag, long userId){
		Optional<User> oUser = repo.findById(userId);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %d not found", userId));
		}
		
		User user = oUser.get();
		if (user.getSubbedTo().contains(hashtag)) {
			user.getSubbedTo().remove(hashtag);
			
			producer.userUnsubscribedFromHashtag(userId, hashtag);
			
			return HttpResponse.ok(String.format("User unsubbed from %s%n", hashtag));			
		} else {
			return HttpResponse.notFound(String.format("Hashtag %s not found", hashtag));
		}
	}
}
