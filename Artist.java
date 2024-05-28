package musiclibrary;

import java.util.ArrayList;

public class Artist extends Account{
    protected String genre;
    protected int numberOfFollowers;
    protected int numberOfMonthlyListener;
    protected String[] albums;
    protected ArrayList<Artist> relatedArtists;
    protected ArrayList<Music> musicsOfArtist;
    
    public Artist() {
        
    }
    
    public void insertAlbum(){
        albums[0] = "Red";
        albums[1] = "Lover";
        albums[2] = "reputation";
    }
    public void showAlbums(){
        for(int i =0; i<=albums.length;i++){
            System.out.println(albums[i]);
        }
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
        if (albums!= null) {
            return albums.length;
        } else {
            return 0;
        }
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
