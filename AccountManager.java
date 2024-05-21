package musiclibrary;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public abstract class AccountManager {
    protected String fullName;
    protected String userName;
    protected long phoneNumber;
    protected String email;
    protected String password;
    protected long accountId;
    protected ArrayList<User> users;
    protected ArrayList<User> friends;
    
    
    public AccountManager(){
    
    }    
    
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

    public void logInToAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("User Name: ");
        String inputUserName = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();
        
        if(inputUserName.equals(this.userName)  && inputPassword.equals(this.password)){
            System.out.println("You log in your account successfully.");
        }else{
            System.out.println("You entered wrong info. Please try again. ");
            logInToAccount();
        }
    }

    
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
    
   
    public void logOut(){
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
    public void updatePassword(){
        String newPassword = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to update your password? ");
        boolean answer = scanner.nextBoolean();
        if(answer== true){
   
            System.out.print("Enter new password: ");
            newPassword = scanner.nextLine();
  
        }
        password= newPassword;
    }
    
    public void updateUserName(){
        System.out.println("user name is updated.");
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getAccountId() {
        return accountId;
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