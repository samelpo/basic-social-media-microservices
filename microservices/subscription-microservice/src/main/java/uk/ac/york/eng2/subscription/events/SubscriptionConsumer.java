package uk.ac.york.eng2.subscription.events;


import java.util.Optional;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.dto.UserDTO;
import uk.ac.york.eng2.subscription.dto.VideoDTO;
import uk.ac.york.eng2.subscription.repositories.UserRepository;
import uk.ac.york.eng2.subscription.repositories.VideoRepository;
import uk.ac.york.eng2.subscription.domain.User;

@KafkaListener(groupId = "subscription-group")
public class SubscriptionConsumer {
	
	@Inject
	VideoRepository repo;
	
	@Inject
	UserRepository userRepo;
	
	@Topic("user-created")
	public void userCreated(@KafkaKey Long id, UserDTO userDetails) {
		User user = new User();
		user.setUsername(userDetails.getUsername());
		
		userRepo.save(user);
		System.out.printf("New user %s%n", user.getUsername());
	}

	@Topic("video-post")
	public void videoPosted(@KafkaKey Long id, VideoDTO videoDetails) {
		
        Video newVideo = new Video();
        newVideo.setHashtags(videoDetails.getHashtags());
        newVideo.setTitle(videoDetails.getTitle());
        
        repo.save(newVideo);
        System.out.printf("Video %s posted%n", newVideo.getTitle());
        }
	
	@Topic("video-like")
	public void videoLiked(@KafkaKey Long id, Video video) {
		Optional<Video> oVideo = repo.findById(id);
		if (oVideo.isEmpty()) {
			System.out.println("Video not found");
		}
		
		Video videoLiked = oVideo.get();
		videoLiked.incrementLikeCount();
		
		repo.update(videoLiked);
	}
}
