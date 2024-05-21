package musiclibrary;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Playlist implements MusicAndPlaylist{
    protected String title;
    protected int numberOfMusic;
    protected int durationInMinute;
    protected User ownerOfPlaylist;
    protected boolean isPlaying;
    
    public Playlist() {
        
    }
    
    
    @Override
    public void play(String title) {
    }

    @Override
    public void like(String title) {
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
                JFrame frame = new JFrame();
                JButton button = new JButton("Share");

                frame.add(button);

                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    @Override
    public void playAgain(String title) {
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