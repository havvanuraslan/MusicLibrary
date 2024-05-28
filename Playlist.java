package musiclibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist implements MusicAndPlaylist{
    protected String title;
    protected int numberOfLikes=0;
    protected int numberOfMusic;
    protected int durationInMinute;
    protected User ownerOfPlaylist;
    protected boolean isPlaying;
    protected String currentPlaylist;
    private ArrayList<Playlist> playlist;
    public Music music;
    
    
    public Playlist() {
        
    }
    
    
    @Override
    public void play(String title) {
        System.out.println("The playlist is playing.");
    }

    @Override
    public void like(String title) {
        System.out.println("The playlist is liked.");
        numberOfLikes++;
    }

    public void search(String playlist) {
        for(Playlist item: this.getPlaylist()){
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
        if(isPlaying && !currentPlaylist.isEmpty()){
            System.out.println(title + " is playing again.");
        }else{
            System.out.println("No song is currently playing.");
        }
    }
    
    
    
    public void createAPlaylist() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to playlist: ");
        this.title = scanner.nextLine();
        System.out.println(getTitle());
        System.out.println("The playlist is created.");
        
    }

    public void addMusicToPlaylist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the music you want to add: ");
        String music = scanner.nextLine();
        this.music.addMusicToArrayList(title);
        this.music.getMusics();
    }

    public void deletePlaylist() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to delete the playlist? ");
        boolean answer = scanner.nextBoolean();
        if(answer == true){
            System.out.println("Playlist is deleted successfully.");
        }
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

    public ArrayList<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Playlist> playlist) {
        this.playlist = playlist;
    }


}