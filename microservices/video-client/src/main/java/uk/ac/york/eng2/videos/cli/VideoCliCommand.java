package uk.ac.york.eng2.videos.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.videos.PostVideoCommand;
import uk.ac.york.eng2.videos.cli.users.AddUserCommand;
import uk.ac.york.eng2.videos.cli.users.GetUsersCommand;
import uk.ac.york.eng2.videos.cli.videos.AddDislikeCommand;
import uk.ac.york.eng2.videos.cli.videos.AddLikeCommand;
import uk.ac.york.eng2.videos.cli.videos.AddViewerCommand;
import uk.ac.york.eng2.videos.cli.videos.GetVideosCommand;
import uk.ac.york.eng2.videos.cli.videos.GetViewersCommand;
import uk.ac.york.eng2.videos.cli.videos.ListByCreatorCommand;
import uk.ac.york.eng2.videos.cli.videos.ListByHashtagCommand;

@Command(name = "video-cli", description = "...",
        mixinStandardHelpOptions = true, subcommands = {
        		GetVideosCommand.class, PostVideoCommand.class,
        		ListByHashtagCommand.class, AddUserCommand.class,
        		GetUsersCommand.class, ListByCreatorCommand.class,
        		AddViewerCommand.class, GetViewersCommand.class,
        		AddLikeCommand.class, AddDislikeCommand.class,
        })
public class VideoCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(VideoCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
