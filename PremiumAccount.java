
package musiclibrary;

public class PremiumAccount extends Account{
    protected boolean isStudent;
    
    public PremiumAccount() {
        
    }
  
    
    
    public void payment(long accountId, boolean isStudent){
        if(isStudent){
            System.out.println("For student account payment is 20$.");
        }else{
            System.out.println("For general account payment is 40$.");
        }
    }

}
