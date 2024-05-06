package musiclibrary;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Artist extends User implements UserInterface{
    private String genre;
    private int numberOfFollowers;
    private int numberOfMonthlyListener;
    private ArrayList<String> albums;
    private ArrayList<Artist> relatedArtists;
    private ArrayList<Music> musics;
    
    public Artist() {
        
    }
    
    
    public void topTracks(){
        
    }
    
    public void relatedArtists() {
        if(relatedArtists!=null && !relatedArtists.isEmpty()){
            System.out.println("Related artists: ");
            for (Artist artist : relatedArtists) {
            System.out.println("- " + artist.getfullName());
            }
        }else {
            System.out.println("No related artists found.");
        }    
    }
    
    public int albumCount() {
        if (getAlbums() != null) {
            return getAlbums().size();
        } else {
            return 0;
        }
    }
    
    @Override
    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create Account");
        System.out.print("Full Name: ");
        this.fullName = scanner.nextLine();
        System.out.print("Email: ");
        this.email = scanner.nextLine();
        System.out.print("User Name: ");
        this.userName = scanner.nextLine();
        System.out.print("Password: ");
        this.password = scanner.nextLine();
       
        System.out.println("Account is created successfully.");
        System.out.println("Full name: " + this.fullName +"\n"+ "Email: "+ this.email+ "\n" + "User Name: "+ this.userName+ "\n" + "Password: " + this.password + "\n");
    }

    @Override
    public void logInToAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("User Name: ");
        String inputUserName = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();
        
        if(inputUserName == this.userName && inputPassword == this.password){
            System.out.println("You log in your account successfully.");
        }else{
            System.out.println("You entered wrong info. Please try again. ");
            logInToAccount();
        }
    }

    @Override
    public void logOut() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Yeni bir JFrame oluşturun
                JFrame frame = new JFrame();
                // Buton oluşturun
                JButton button = new JButton("Log Out");

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
    public void deleteAccount(long accountId) {
        User userToDelete = null;
        for(User user : users){
            if(user.getAccountId() == accountId){
                userToDelete = user;
                break;
            }
        }
        
        if (userToDelete != null) {
            this.getUsers().remove(userToDelete);
            System.out.println("Account with ID " + accountId + " deleted successfully.");
        } else {
            System.out.println("Account with ID " + accountId + " not found.");
        }
    }

    @Override
    public void updatePassword() {
        
    }

    @Override
    public void updateUserName() {

    }

    
    
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfMonthlyListener() {
        return numberOfMonthlyListener;
    }

    public void setNumberOfMonthlyListener(int numberOfMonthlyListener) {
        this.numberOfMonthlyListener = numberOfMonthlyListener;
    }

    public ArrayList<String> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<String> albums) {
        this.albums = albums;
    }

    public ArrayList<Artist> getRelatedArtists() {
        return relatedArtists;
    }

    public void setRelatedArtists(ArrayList<Artist> relatedArtists) {
        this.relatedArtists = relatedArtists;
    }

    private String getfullName() {
        return fullName; 
    }

    
    
}
