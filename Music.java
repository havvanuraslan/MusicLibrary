package musiclibrary;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Music implements MusicAndPlaylist{
    private String title;
    private String artist;
    private String album;
    private String genre;
    private int durationInSeconds;
    private int releaseYear;
    private String filePath;
    private String lyrics;
    private double rating;
    private String composer;
    private boolean isPlaying;
    private String currentMusic;

    public Music() {
        
    }
    
    @Override
    public void play(String title) {
        isPlaying = false;
        if(isPlaying){
            System.out.println("Music is not playing.");
        }else{
            currentMusic = title;
            System.out.println("Music " + currentMusic + " is playing.");
        }
        isPlaying = false;
    }

    @Override
    public double like() {
        return rating;
    }
    
    @Override
    public void search() {
        
    }
    @Override
    public void mix() {
    }

    @Override
    public void share() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Yeni bir JFrame oluşturun
                JFrame frame = new JFrame();
                // Buton oluşturun
                JButton button = new JButton("Share");

                // Butonu frame'e ekle
                frame.add(button);

                // Frame'i boyutlandırın ve görünür yapın
                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    @Override
    public void playAgain() {
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

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    
}
