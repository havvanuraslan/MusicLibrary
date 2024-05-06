package musiclibrary;

public class Playlist implements MusicAndPlaylist{
    private String title;
    private int numberOfMusic;
    private int durationInMinute;
    private User ownerOfPlaylist;

    public Playlist(String title, int numberOfMusic, int durationInMinute) {
        this.title = title;
        this.numberOfMusic = numberOfMusic;
        this.durationInMinute = durationInMinute;
    }
    
    
    @Override
    public void play() {
    }

    @Override
    public double like() {
        return 0;
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
    
    public void createAPlaylist() {
    }

    public void addMusicToPlaylist() {
    }

    public void deletePlaylist() {
    }

    
    
    
    
    
    
    
    
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfMusic() {
        return numberOfMusic;
    }

    public void setNumberOfMusic(int numberOfMusic) {
        this.numberOfMusic = numberOfMusic;
    }

    public int getDurationInMinute() {
        return durationInMinute;
    }

    public void setDurationInMinute(int durationInMinute) {
        this.durationInMinute = durationInMinute;
    }

    public User getOwnerOfPlaylist() {
        return ownerOfPlaylist;
    }

    public void setOwnerOfPlaylist(User ownerOfPlaylist) {
        this.ownerOfPlaylist = ownerOfPlaylist;
    }


}