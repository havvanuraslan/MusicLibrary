
package musiclibrary;

public class TestClass {
    public static void main(String[] args) {
        Account account1 = new Account();
        Music music = new Music();
        //account1.createAccount();
        //account1.updatePassword();
        //System.out.println(account1.password);
        //music.share();
        Account p1 = new PremiumAccount();
        account1.createAccount();
        PremiumAccount pa1 = new PremiumAccount();
        p1.logInToAccount();
    }
}
