package musiclibrary;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Music implements MusicAndPlaylist{
    protected String title;
    protected String artist;
    protected String album;
    protected String genre;
    protected int durationInSeconds;
    protected int releaseYear;
    protected String filePath;
    protected String lyrics;
    protected double rating;
    protected String composer;
    protected boolean isPlaying;
    protected String currentMusic;
    protected int numberOfLikes;
    private ArrayList<String> musics = new ArrayList<>();
    

    public Music() {
        
    }
    
    public void addMusicToArrayList(String music){
        getMusics().add(music);
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
    public void like(String title) {
        numberOfLikes++;
        System.out.println("The music is liked.");
    }
    
    public void search(String music) {
        for(String item: this.getMusics()){
            if(item.equals(music)){
                System.out.print("The music is listed: ");
                System.out.println(music);
                break;
            }else{
                System.out.println("The music is not found");
            }
        }
           
    }
    
    @Override
    public void playAgain(String title) {
        if(isPlaying && !currentMusic.isEmpty()){
            System.out.println(title + " is playing again.");
        }else{
            System.out.println("No song is currently playing.");
        }
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

    public ArrayList<String> getMusics() {
        return musics;
    }

    public void setMusics(ArrayList<String> musics) {
        this.musics = musics;
    }

    
}
