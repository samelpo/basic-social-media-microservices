package uk.ac.york.eng2.trending.events;

import java.util.Optional;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.domain.Hashtag;
import uk.ac.york.eng2.trending.domain.Video;
import uk.ac.york.eng2.trending.repositories.TrendingRepository;

@KafkaListener(groupId = "trending-hashtag-group")
public class TrendingConsumer {

	@Inject
	TrendingRepository repo;
	
	@Inject
	TrendingProducer producer;
	
	@Topic("video-like")
	public void videoLiked(@KafkaKey Long id, Video video) {
		
		for(String hashtag : video.getHashtags()) {
			Optional<Hashtag> oHashtag = repo.findByName(hashtag);
			if (oHashtag.isEmpty()) {
				Hashtag newHashtag = new Hashtag();
				newHashtag.setName(hashtag);
				newHashtag.incrementLikes();
				repo.save(newHashtag);
				
				producer.likedHashtag(newHashtag.getId(), newHashtag);
			}
			if (oHashtag.isPresent()) {
				Hashtag existingHashtag = oHashtag.get();
				existingHashtag.incrementLikes();
				repo.update(existingHashtag);
				
				producer.likedHashtag(existingHashtag.getId(), existingHashtag);
			}
			// Hashtag existingHashtag = hashtagMap.computeIfAbsent(hashtag, Hashtag::new);
			// existingHashtag.incrementLikes();
			// System.out.printf("no of likes: %s%n", existingHashtag.getNumberOfLikes());
			// repo.save(existingHashtag);
			}
		System.out.printf("Video Liked: %d%n", id);
	}
	
	@Topic("video-viewed")
	public void videoViewed(@KafkaKey Long id, Video video) {
		System.out.printf("Video viewed: %d%n", id);
	}
	
	@Topic(TrendingProducer.TOPIC_LIKED_HASHTAG)
	public void likedHashtags(@KafkaKey Long id, Hashtag hashtag) {
		System.out.printf("%s hashtag was liked%n", hashtag.getName());
	}
	
	@Topic(TrendingStreams.TOPIC_TOP_TEN_LIKED_BY_HOUR)
	public void videoViewedMetric(@KafkaKey WindowedIdentifier window, Long count) {
		System.out.printf("New value for key %s: %d%n", window, count);
	}
}
