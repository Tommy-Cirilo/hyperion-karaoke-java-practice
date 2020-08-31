public class MusicPlayer extends Player {
    private String voice = "";

    //an empty constructor
    public static void MusicPlayer() {
    }

    public MusicPlayer(String voice) {
        this.voice = voice;
    }

    //getter
    public String getVoice() {
        return voice;
    }

    //setter
    public void setVoice(String voice) {
        this.voice = voice;
    }


    /*an implmentation of the play method that takes in a song instance */
    @Override
    public void play(Album album) {
        for (Song song : album.getSongs()) {
            play(song);
        }
    }

    @Override
    public void play(Song song) {
        Runtime r = Runtime.getRuntime();
//-  a command can be issued from Java to the terminal using ```r.exec()``` and passing in a string that will be executed by the terminal (this will require handling a checked exception; please use a try-catch for this)
//		-  you can make your MacBook say text aloud by simply running a command in the terminal using the ```say``` command. For example, you can make your computer say "hello world" by typing into the terminal ```say hello world```
//		-  using the knowledge in the previous bullet points, this method should issue a say command to the terminal for each lyric in the list of song ```lyrics```
//	-  to avoid saying multiple words at once, issue include a pause after saying "now playing...SONG_TITLE by SONG_ARTIST" using the ```sleep()``` method and passing in the ```INTRO_PAUSE``` constant (this is the number of milliseconds to wait) and include a ```sleep()``` command after each lyric reading command is issued, passing in the constant ```WORD_CADENCE```
        try {
            r.exec("say " + "now playing..." + song.getTitle() + " by " + song.getArtist());
            Thread.sleep(Player.INTRO_PAUSE);
            for (String lyric : song.getLyrics()) {
                r.exec("say " + lyric);
                Thread.sleep(Player.WORD_CADENCE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}