package uk.ac.york.eng2.videos.cli.videos;

import java.util.List;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;
import uk.ac.york.eng2.videos.cli.users.UsersClient;

@Command(name = "post-video", description = "Posts a video (video title, user id, hashtags..)",
mixinStandardHelpOptions = true)
public class PostVideoCommand implements Runnable {

	@Inject
	private VideosClient client;
	
	@Inject UsersClient userClient;
	
	@Parameters(index="0")
	private String title;

	@Parameters(index="1", description="user who created the video")
	private Long creatorId;
	
	@Parameters(index="2..", description="additional hashtags to the video")
	private List<String> hashtags;
	
	@Override
	public void run() {
		VideoDTO dto = new VideoDTO();
		dto.setTitle(title);
		dto.setHashtags(hashtags);
		dto.setCreatorId(creatorId);
		
		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}
}
