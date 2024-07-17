package uk.ac.york.eng2.videos.cli.subscriptions;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="unsub-from-hashtag", description="Allows a user to unsub from a hashtag (hashtag, userId)", mixinStandardHelpOptions = true)
public class UnsubFromHashtagCommand implements Runnable {

	@Inject
	SubClient client;
	
	@Parameters(index="0")
	private String hashtag;

	@Parameters(index="1")
	private Long userId;
	
	@Override
	public void run() {
		HttpResponse<String> response = client.removeSubscription(hashtag, userId);
		System.out.printf("Server responded with status %s: %s%n",
				response.getStatus(), response.getBody().orElse("(no text)"));
	}
}
