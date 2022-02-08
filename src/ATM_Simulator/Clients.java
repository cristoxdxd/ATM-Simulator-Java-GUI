package ATM_Simulator;

/**
 *
 * @author Cristopher Herrera
 */
public class Clients {
    private String CardCode;
    private String FullName;
    private double balance;
    
    public Clients(){}
    
    public Clients(String CardCode, String FullName, double balance){
        this.CardCode = CardCode;
        this.FullName = FullName;
        this.balance = balance;
    }
    
    public void formatRegister(){
        String register = CardCode + "\t" +
                FullName + "\t" +
                balance;
    }

    @Override
    public String toString() {
        return "Card Number: XXXX-XXXX-XX" + CardCode + "\n" +
               "FullName: " + FullName + "\n" +
               "Balance: " + balance + "\n";
    } 
}
