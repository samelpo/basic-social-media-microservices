package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Command(name = "list-by-creator", description = "Lists all the videos made by a certain creator (username or user id)",
mixinStandardHelpOptions = true)
public class ListByCreatorCommand implements Runnable {

	@Inject
	private VideosClient client;
	
	@Parameters(index="0")
	private String creator;
	
	@Parameters(index="0")
	private Long creatorId;
	
	@Override
	public void run() {
		Iterable<Video> videoList = client.list();
		for (Video v : videoList) {
			if(v.getCreator().getUsername().contains(creator)) {
				System.out.println(v);
			} else if(v.getCreator().getId().equals(creatorId)) {
				System.out.println(v);
			}
		}
	}
}
