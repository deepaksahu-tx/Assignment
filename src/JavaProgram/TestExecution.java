package JavaProgram;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestExecution {
	
	@Test
	public void playSong() {
	    UserRecentlyPlaySong store = new UserRecentlyPlaySong(3);
	    store.addSong("S1", "User1");
        store.addSong("S2", "User1");
        store.addSong("S3", "User1");
        store.addSong("S4", "User1");

        List<String> recentSongs = store.getRecentSongs("User1");
        System.out.println("Recent songs played by User1: " + recentSongs);
	}

}
