
package musiclibrary;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  

public class CreateTable {
    public static void createNewTable() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:C:/sqlite/Music.db";  
          
        // SQL statement for creating a new table  
        String sql = "CREATE TABLE IF NOT EXISTS music (\n"  
                + " title TEXT PRIMARY KEY, \n"  
                + " artistOfMusic TEXT NOT NULL,\n"  
                + " album TEXT NOT NULL,\n" 
                + " genre TEXT NOT NULL,\n"
                + " durationInSeconds INT NOT NULL,\n"
                + " releaseYear INT NOT NULL,\n"
                + " filePath TEXT NOT NULL,\n"
                + " lyrics TEXT NOT NULL,\n"
                + " rating DOUBLE NOT NULL,\n"
                + " composer TEXT NOT NULL,\n"
                + " isPlaying BOOLEAN NOT NULL,\n"
                + " numberOfLikes INT NOT NULL,\n"
                + ");";   
          
        try{  
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();  
            stmt.execute(sql);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
    public static void main(String[] args) {  
        createNewTable();  
    }  
}
