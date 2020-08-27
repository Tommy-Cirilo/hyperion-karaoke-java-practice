import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
    private String title;
    private String artist;
    //this is going to have everything stored in it
    private List<String> lyrics;

    public Song(String title, String artist, List<String> lyrics) {
        this.title  = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(List<String> lyrics) {
        this.lyrics = lyrics;
    }

    public static List<String> parseLyrics(String lyrics) {
        //Isn't it ironic don't you think
        //--->> "isn't" "it" "ironic" ....
        //transforms into a string list, so it needs a return type "List<String>
        List<String> lyricList = new ArrayList<>();

        String[] lyricArr = lyrics.split(" ");
        lyricList.addAll(Arrays.asList(lyricArr));
        return lyricList;

    }

}