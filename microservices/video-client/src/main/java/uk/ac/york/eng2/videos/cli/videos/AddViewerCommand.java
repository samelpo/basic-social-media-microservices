package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.users.UsersClient;

@Command(name="add-viewer", description="Adds a viewer to a video (video id, user id)", mixinStandardHelpOptions = true)
public class AddViewerCommand implements Runnable {

	@Inject
	private VideosClient client;
	
	@Inject UsersClient userClient;

	@Parameters(index="0")
	private Long videoId;

	@Parameters(index="1")
	private Long userId;

	@Override
	public void run() {
		HttpResponse<String> response = client.addViewer(videoId, userId);
		System.out.printf("Server responded with status %s: %s%n",
			response.getStatus(), response.getBody().orElse("(no text)"));
		
	}

}