package uk.ac.york.eng2.videos.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Video;

@KafkaClient
public interface VideosProducer {

	String TOPIC_VIEWED = "video-viewed";
	String TOPIC_POST = "video-post";
	String TOPIC_LIKE = "video-like";
	String TOPIC_DISLIKE = "video-dislike";
	
	@Topic(TOPIC_VIEWED)
	void viewedVideo(@KafkaKey Long videoId, Video video);
	
	@Topic(TOPIC_POST)
	void postVideo(@KafkaKey Long videoId, Video video);
	
	@Topic(TOPIC_LIKE)
	void likeVideo(@KafkaKey Long videoId, Video video);

	@Topic(TOPIC_DISLIKE)
	void dislikeVideo(@KafkaKey Long videoId, Video video);
}
