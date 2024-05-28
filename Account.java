package musiclibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class Account extends AccountManager{
    protected ArrayList<User> friends = null;
    User user= new User();
    
    public Account() {
          
    }
    
    public void addFriends() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the person you want to add: ");
        String userToAdd = scanner.nextLine();
        for(User user: users){
            for(int i = 0; i<= users.size();i++){
                if(user.users.get(i).equals(userToAdd)){
                    System.out.println("The friend is added successfully.");
                }else{
                    System.out.println("The friend is not found.");
                }
            }
        }
            

    }

    public void deleteFriends(long accountId) {
        User friendToDelete = null;
        for(User user : users){
            if(user.getAccountId() == accountId){
                friendToDelete = user;
                break;
            }
        }

        if (friendToDelete != null) {
            this.friends.remove(friendToDelete);
            System.out.println("Friend with ID " + accountId + " is deleted successfully.");
        } else {
            System.out.println("Friend with ID " + accountId + " is not deleted.");
        }

    }
}