package musiclibrary;

import java.util.ArrayList;

public abstract class User {
    protected String fullName;
    protected String userName;
    protected long phoneNumber;
    protected String email;
    protected String password;
    protected long accountId;
    protected ArrayList<User> users;
    protected ArrayList<User> friends;

    public User(String fullName, String userName, long phoneNumber, String email, String password, long accountId) {
        this.fullName = fullName;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.accountId = accountId;
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

    
    
    
    
    
    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }
}
