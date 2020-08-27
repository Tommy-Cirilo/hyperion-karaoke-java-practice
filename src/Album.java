import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private List<Song> songs;

    public Album(String album, List<Song> songs) {
        this.albumName = album;
        this.songs = songs;
    }

    public String getAlbum() {
        return albumName;
    }

    public void setAlbum(String album) {
        this.albumName = album;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void printTrackListings() {
        // we have access to 'songs' - iterate through them here
        System.out.println(albumName + " track listing ...");

        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i).getTitle() +
                    " by " + songs.get(i).getArtist());
        }
    }

    public static void main(String[] args) {
        String lyrics1 = "alsdkfjdasfjdalfjbljafdil";
        String lyrics2 = "alsdkfjdasfjdalfjbljafdil fasldkfjadsoifjsdoi";
        String lyrics3 = "alsdkfjdasfjdalfjbljafdil fasldkfjadsoifjsdoi fasdfhjiodusafhioadsf";
        Song followYouHome = new Song("Follow you home", "Nickelback",
                Song.parseLyrics(lyrics1));
        Song photograph = new Song("photograph", "Nickelback" , Song.parseLyrics(lyrics2));
        Song thisSucks = new Song("thisSucks", "Nickelback" , Song.parseLyrics(lyrics3));

        List<Song> theseSongs = new ArrayList<>();
        theseSongs.add(followYouHome);
        theseSongs.add(photograph);
        theseSongs.add(thisSucks);



        Album allTheWrongReasons = new Album("All the wrong reasons",theseSongs );

    }
}