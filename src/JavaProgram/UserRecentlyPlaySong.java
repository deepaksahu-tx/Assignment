package JavaProgram;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.*;

public class UserRecentlyPlaySong {
    private final int capacity;
    private final LinkedHashMap<String, LinkedList<String>> songs;

    public UserRecentlyPlaySong(int capacity) {
        this.capacity = capacity;
        this.songs = new LinkedHashMap<String, LinkedList<String>>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, LinkedList<String>> eldest) {
                return size() > capacity;
            }
        };
    }

    public void addSong(String song, String user) {
        if (!songs.containsKey(song)) {
            songs.put(song, new LinkedList<>());
        }
        LinkedList<String> users = songs.get(song);
        users.addFirst(user);
    }

    public List<String> getRecentSongs(String user) {
        List<String> recentSongs = new ArrayList<>();
        for (Map.Entry<String, LinkedList<String>> entry : songs.entrySet()) {
            String song = entry.getKey();
            LinkedList<String> users = entry.getValue();
            if (users.contains(user)) {
                recentSongs.add(song);
            }
        }
        return recentSongs;
    }
}
