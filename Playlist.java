package musiclibrary;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Playlist implements MusicAndPlaylist{
    private String title;
    private int numberOfMusic;
    private int durationInMinute;
    private User ownerOfPlaylist;

    public Playlist() {
        
    }
    
    
    @Override
    public void play(String title) {
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