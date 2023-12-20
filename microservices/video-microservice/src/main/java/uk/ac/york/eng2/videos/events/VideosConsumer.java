package uk.ac.york.eng2.videos.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Video;

@KafkaListener(groupId = "videos-debug")
public class VideosConsumer {

	@Topic(VideosProducer.TOPIC_VIEWED)
	public void viewedVideo(@KafkaKey Long videoId, Video video) {
		System.out.printf("Video viewed: %d%n", videoId);
	}
}
