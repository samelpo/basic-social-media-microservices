package uk.ac.york.eng2.videos.cli.trending;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;

@Command(name = "get-top-10-hashtags", description = "lists the top 10 liked hashtags", mixinStandardHelpOptions = true)
public class TopTenLikedHashtagsCommand implements Runnable {

	@Inject
	TrendingClient client;
	
	@Override
	public void run() {
		for (Hashtag hashtag : client.topTenHashtags()) {
			System.out.println(hashtag);
		}
		
	}
	
}
