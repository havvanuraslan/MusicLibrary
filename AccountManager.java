package musiclibrary;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class AccountManager {
    protected String fullName;
    protected String userName;
    protected int phoneNumber;
    protected String email;
    protected String password;
    protected int accountId =(int) (Math.random()*1000);
    protected ArrayList<User> users;
    InsertRecords insert = new InsertRecords();
    
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
        System.out.println("Full name: " + this.fullName +"\n"+ "Email: "+ this.email+ "Phone number: "+ this.phoneNumber+ "\n" + "User Name: "+ this.userName+ "\n" + "Password: " + this.password + "\n");
        
        
        insert.insert( accountId, this.fullName, this.userName, this.email, this.password);
        
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
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dou you want to log out? ");
        boolean answer = scanner.nextBoolean();
        
        if (answer =true) {
            System.out.println("You logged out successfully.");
        }
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
        this.password= newPassword;
    }
    
    public void updateUserName(){
        String newUserName = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to update your username? ");
        boolean answer = scanner.nextBoolean();
        if(answer== true){
   
            System.out.print("Enter new username: ");
            newUserName = scanner.nextLine();
        }
        this.userName= newUserName;
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

    public void setPhoneNumber(int phoneNumber) {
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

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

}