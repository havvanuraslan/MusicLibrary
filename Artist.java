package musiclibrary;

import java.util.ArrayList;

public class Artist extends Account{
    protected String genre;
    protected int numberOfFollowers;
    protected int numberOfMonthlyListener;
    protected ArrayList<String> albums;
    protected ArrayList<Artist> relatedArtists;
    protected ArrayList<Music> musics;
    
    public Artist() {
        
    }
    
    
    public void topTracks(){
        
            System.out.println("");
        
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
