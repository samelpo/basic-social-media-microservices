package uk.ac.york.eng2.videos.cli.subscriptions;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="sub-to-hashtag", description="Allows a user to sub to a hashtag (hashtag, userId)", mixinStandardHelpOptions = true)
public class SubToHashtagCommand implements Runnable {

	@Inject
	SubClient client;
	
	@Parameters(index="0")
	private String hashtag;

	@Parameters(index="1")
	private Long userId;
	
	@Override
	public void run() {
		HttpResponse<String> response = client.addSubscription(hashtag, userId);
		System.out.printf("Server responded with status %s: %s%n",
				response.getStatus(), response.getBody().orElse("(no text)"));
	}
}
