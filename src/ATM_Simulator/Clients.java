package ATM_Simulator;

import java.io.*;
import java.security.*;
import java.util.*;

/**
 *
 * @author Cristopher Herrera
 */
public class Clients implements Serializable{
    private static final long serialVersionUID = 4078479646868380066L;
    
    private String CardCode;
    private String Password;
    private String FullName;
    private String birthday;
    private double Balance;
    
    public Clients(){}
    
    public Clients(String CardCode, String FullName, String Password, double Balance, String birthday) throws NoSuchAlgorithmException{
        String hashedCardCode = encoderString(CardCode);
        this.CardCode = hashedCardCode;
        this.FullName = FullName;
        String encodedPassword = encoderString(Password);
        this.Password = encodedPassword;
        this.Balance = Balance;
        this.birthday = birthday;
    }
     
    public String formatRegister(int number){
        String register = number + "\t" + CardCode + "\t" +
                FullName + "\t" +
                Password + "\t" +
                Balance + "\t" +
                birthday;
        return register;
    }

    @Override
    public String toString() {
        return "Card Number: XXXX-XXXX-XX" + CardCode + "\n" +
               "FullName: " + FullName + "\n" +
               "Balance: " + Balance + "\n";
    } 
    
    public boolean find(String search){
        boolean validator = false;
        String encodedSearch = encoderString(search);
        if(encodedSearch.equals(this.CardCode)){
            validator = true;
        }
        return validator;
    }

    public String getCardCode() {
        return CardCode;
    }

    public String getPassword() {
        return Password;
    }
    
    public void setPassword(String Password) throws NoSuchAlgorithmException {
        //String PasswordString = Integer.toString(Password);
        String encodedPassword = encoderString(Password);
        this.Password = encodedPassword;
    }

    public String getFullName() {
        return FullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public double getBalance() {
        return Balance;
    }
    
    public void setBalance(double balance) {
        this.Balance = balance;
    }
    
    public static String encoderString(String originalString){
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        return encodedString;
    }
}
