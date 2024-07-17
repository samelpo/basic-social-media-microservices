package uk.ac.york.eng2.subscription.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface SubscriptionProducer {

	@Topic("user-subscribed")
	void userSubscribedToHashtag(@KafkaKey Long id, String hashtag);
	
	@Topic("user-unsubscribed")
	void userUnsubscribedFromHashtag(@KafkaKey Long id, String hashtag);
}
