/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbio.bank.serial;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import sbio.bank.BankAccount;
/**
 *This program demonstrates SERIALIZATIN of a bank object.
 *if a file with serialized data exists, then it is loaded.
 *Otherwise the program starts with a new bank.
 *Bank accounts are added to the bank. Then the bank object is saved.
 * @author Pana
 */
public class SerialDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // TODO code application logic here
        Bank firstBankOfJava;
        File f = new File("bank.dat");
        if (f.exists()) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
            firstBankOfJava = (Bank) in.readObject();
            in.close();
        }
        else{
            firstBankOfJava = new Bank();
            firstBankOfJava.addAccount(new BankAccount(20000, 1001));
            firstBankOfJava.addAccount(new BankAccount(10000, 1015));
            
            //Deposit some money
            BankAccount objBankAcc = firstBankOfJava.find(1001);
            objBankAcc.accDeposit(100);
            System.out.println(objBankAcc.getAccountNumber() + " : "+ objBankAcc.getAccountBalance());
            objBankAcc = firstBankOfJava.find(1015);
            System.out.println(objBankAcc.getAccountNumber() + " : "+ objBankAcc.getAccountBalance());
            
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
            out.writeObject(firstBankOfJava);
            out.close();
            
            
        }
    }
    
}
