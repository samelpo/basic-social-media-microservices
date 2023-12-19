package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Command(name = "list-by-hashtag", description = "Lists all the videos with a certain hashtag (#hashtag)",
mixinStandardHelpOptions = true)
public class ListByHashtagCommand implements Runnable {

	@Inject
	private VideosClient client;
	
	@Parameters(index="0")
	private String hashtag;
	
	@Override
	public void run() {
		Iterable<Video> videoList = client.list();
		for (Video v : videoList) {
			if(v.getHashtags().contains(hashtag)) {
				System.out.println(v);
			}
		}
	}
	
}
