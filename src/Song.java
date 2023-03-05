import java.util.ArrayList;
import java.util.Objects;

public class Song {

    private final String title;
    private final String artist;

    public Song(String x, String y) {
        title = x;
        artist = y;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    private static final ArrayList<String> a = new ArrayList<>();
    public static int howMany(ArrayList<String> arr) {
        int x = 0;
        for (String s : arr) {
            String name = s.toLowerCase();
            if (!a.contains(name)) {
                a.add(name);
                x++;
            }
        }
        return(x);
    }


}