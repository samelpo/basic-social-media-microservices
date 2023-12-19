package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="add-dislike", description="Adds a dislike to a video (video id)", mixinStandardHelpOptions = true)

public class AddDislikeCommand implements Runnable {

	@Inject
	VideosClient client;
	
	@Parameters(index="0")
	private Long videoId;
	
	@Override
	public void run() {
		
		HttpResponse<String> response = client.addDislike(videoId);
		System.out.printf("Server responded with status %s: %s%n",
			response.getStatus(), response.getBody().orElse("(no text)"));
		
	}
}