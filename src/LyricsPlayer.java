public class LyricsPlayer extends Player{
    //creates static color constants
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";



    private String textColor = "default";

    public void LyricsPlayer() {
    }

    public void setTextCol(String textColor){
        this.textColor = textColor;
    }

    //getter
    public String getTextColor() {
        return textColor;
    }
    //setter
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    private void displayText(String string) {
        String colorCode = RESET;
        switch(textColor.toLowerCase()) {
            case "red":
                colorCode = RED;
                break;
            case "green":
                colorCode = GREEN;
                break;
            case "yellow":
                colorCode = YELLOW;
                break;
            case "blue":
                colorCode = BLUE;
                break;
            case "purple":
                colorCode = PURPLE;
                break;
            case "cyan":
                colorCode = CYAN;
                break;
        }
        System.out.printf("%s%s", colorCode, string);
    }



    @Override
    public void play(Album album) {
        for(Song song : album.getSongs()){
            play(song);
        }
    }

    @Override
    public void play(Song song) {
        try {
            System.out.println(RESET + "now playing..." + song.getTitle() + " by " + song.getArtist());
            Thread.sleep(Player.INTRO_PAUSE);
            for(String lyric :song.getLyrics()){
                displayText(lyric + " ");
                Thread.sleep(Player.WORD_CADENCE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}