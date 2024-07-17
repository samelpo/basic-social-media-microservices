package uk.ac.york.eng2.videos.cli.trending;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;

@Command(name = "get-all-hashtags", description = "list all of the hashtags", mixinStandardHelpOptions = true)
public class GetHashtagsCommand implements Runnable {

	@Inject
	TrendingClient client;
	
	@Override
	public void run() {
		for (Hashtag hashtag : client.list()) {
			System.out.println(hashtag);
		}
	}
}
