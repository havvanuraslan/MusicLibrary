
package musiclibrary;

public interface UserInterface {
    public void createAccount();
    public void logInToAccount();
    public void logOut();
    public void deleteAccount(long accountId);
    public void updatePassword();
    public void updateUserName();
}
