package uk.ac.york.eng2.videos;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
import uk.ac.york.eng2.videos.repositories.VideosRepository;

@MicronautTest
public class VideosControllerTest {

	@Inject
	VideosClient videoClient;
	
	@Inject
	VideosRepository videoRepo;
	
	@Inject
	UsersRepository userRepo;
	
	@BeforeEach
	public void clean() {
		videoRepo.deleteAll();
		userRepo.deleteAll();
	}
	
	@Test
	public void noVideos() {
		Iterable<Video> iterVideos = videoClient.list();
		assertFalse(iterVideos.iterator().hasNext(), "Service should not list any videos initially");
	}
}
