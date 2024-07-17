package uk.ac.york.eng2.videos.cli.subscriptions;

import java.util.Set;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.User;

@Command(name = "subbed-top-10-next-videos-to-watch", description = "lists the top 10 next videos to watch per hashtag for a user (userId)", mixinStandardHelpOptions = true)
public class GetTopTenNextVideosPerHashtagCommand implements Runnable{

	@Inject
	SubClient userClient;
	
	@Inject
	SubVideoClient videoClient;
	
	@Parameters(index="0")
	private Long id;
	
	@Override
	public void run() {
		// for (User u : userClient.list())
		Iterable<User> userList = userClient.list();
		
		for (User u : userList) {
			if (u.getId().equals(id)) {
				System.out.println(u.getSubbedTo());
				for (String hashtag : u.getSubbedTo()) {
					System.out.printf("===============================================================%nRecommended videos to watch for %s:%n%n", hashtag);
					videoClient.TopVideos(10).forEach(t -> {
					if(t.getHashtags().contains(hashtag)) {
						System.out.println("Title: " + t.getTitle() + " | hashtags: " + t.getHashtags() + " Likes: " + t.getLikeCount());						
						}
				});
				}
				
			}
		}
		
	}
}
