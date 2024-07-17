package uk.ac.york.eng2.videos.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.dto.UserDTO;

@KafkaClient
public interface UsersProducer {

	@Topic("user-created")
	void userCreated(@KafkaKey Long creatorId, UserDTO userDetails);
}
