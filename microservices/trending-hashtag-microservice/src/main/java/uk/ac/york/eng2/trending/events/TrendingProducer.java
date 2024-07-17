package uk.ac.york.eng2.trending.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.trending.domain.Hashtag;

@KafkaClient
public interface TrendingProducer {

	String TOPIC_LIKED_HASHTAG= "liked-hashtag";
	
	@Topic(TOPIC_LIKED_HASHTAG)
	void likedHashtag(@KafkaKey Long id, Hashtag hashtag);
}
