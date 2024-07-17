package uk.ac.york.eng2.trending.controllers;

import java.util.List;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.domain.Hashtag;
import uk.ac.york.eng2.trending.repositories.TrendingRepository;

@Controller("/hashtags")
public class HashtagController {

	@Inject
	TrendingRepository repo;
	
	@Get("/")
	public Iterable<Hashtag> list() {
		return repo.findAll();
	}
	
	@Get("/top10")
	public List<Hashtag> topTenHashtags() {
		return repo.findTop10OrderByNumberOfLikesDesc();
	}
}
