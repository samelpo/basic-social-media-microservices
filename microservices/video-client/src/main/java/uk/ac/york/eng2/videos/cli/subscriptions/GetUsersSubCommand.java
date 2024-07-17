package uk.ac.york.eng2.videos.cli.subscriptions;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.videos.cli.domain.User;

@Command(name = "get-users-sub", description = "gets users from sub", mixinStandardHelpOptions = true)
public class GetUsersSubCommand implements Runnable {

	@Inject
	SubClient client;
	
	@Override
	public void run() {
		for (User u : client.list()) {
			System.out.println(u);
		}
	}
}
