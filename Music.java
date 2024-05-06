package musiclibrary;

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

    public Music(String title, String artist, String album, String genre, int durationInSeconds, int releaseYear, String filePath, String lyrics, double rating, String composer) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.durationInSeconds = durationInSeconds;
        this.releaseYear = releaseYear;
        this.filePath = filePath;
        this.lyrics = lyrics;
        this.rating = rating;
        this.composer = composer;
    }
    
    @Override
    public void play() {
        
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
