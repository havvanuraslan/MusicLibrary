package musiclibrary;

public class Account extends AccountManager{
    
    public Account() {
      
        
    }
    
    public void addFriends(long accountId) {
        User userToAdd = null;
        for(User user : users){
            if(user.getAccountId() == accountId){
                userToAdd = user;
                break;
            }
        }

        if (userToAdd != null) {
            this.getUsers().add(userToAdd);
            System.out.println("Account with ID " + accountId + " added successfully.");
        } else {
            System.out.println("Account with ID " + accountId + " is not found.");
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
            this.getUsers().remove(friendToDelete);
            System.out.println("Friend with ID " + accountId + " is deleted successfully.");
        } else {
            System.out.println("Friend with ID " + accountId + " is not deleted.");
        }

    }
}