/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbio.bank;
import java.io.IOException;
import java.util.Scanner;
/**
 *This program demonstrates random access, you can access
 *existing accounts and deposit money , or create new accounts.
 The accounts are saved in a random access file.
 * @author Pana
 */
public class BankSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BankData objData = new BankData();
        try {
            objData.open("bank.dat");
            boolean done = false;
            while (!done) {                
                System.out.print("Account Number: ");
                int accNo = sc.nextInt();
                System.out.print("Amount to Deposit: ");
                double accDepAmount = sc.nextDouble();
                
                int pos = objData.find(accNo);
                BankAccount objAccount;
                if (pos >= 0) {
                    objAccount = objData.read(pos);
                    objAccount.accDeposit(accDepAmount);
                    System.out.println("New Balance: "+ objAccount.getAccountBalance());
                }
                else{//add an account
                
                    objAccount = new BankAccount(accDepAmount, accNo);
                    pos = objData.size();
                    System.out.println("Adding a new account.");
                }
                objData.write(pos, objAccount);
                System.out.print("Done? [Y/N] ");
                String input = sc.next();
                if (input.equalsIgnoreCase("Y")) {
                    done = true;
                }
                
            }
        } finally {
        
            objData.close();
        }
        
        
        
    }
    
}
