package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.User;

@Command(name="get-viewers", description="Gets the viewers of a specific video (video id)", mixinStandardHelpOptions = true)
public class GetViewersCommand implements Runnable {

	@Inject
	private VideosClient client;

	@Parameters(index="0")
	private Long id;

	@Override
	public void run() {
		Iterable<User> users = client.getViewers(id);
		for (User user : users) {
			System.out.println(user);
		}
	}
	
}