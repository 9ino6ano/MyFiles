/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbio.bank.serial;
import java.io.Serializable;
import java.util.ArrayList;
import sbio.bank.BankAccount;
/**
 *This bank contain a collection of bank accounts.
 * @author Pana
 */
public class Bank implements Serializable{
    private ArrayList<BankAccount> objAcc;
    
    /**
     *Construct a bank with no bank accounts 
     */
    
    public Bank(){
        objAcc = new ArrayList<BankAccount>();
    }
    /**
     *Adds an account to this bank.
     *@param a - the account to be added.
     */
    public void addAccount(BankAccount objAccounts){
    
        objAcc.add(objAccounts);
    }
    /**
     *Finds a bank account with a given number
     *@param accountNo the object account to find
     *@return the account with a given number, or null
     * if no such account exists.
     */
    public BankAccount find(int accNo){
    
        for (BankAccount objA : objAcc) {
            if (objA.getAccountNumber() == accNo) {// found a match
                return objA;
            }
        }
        return null;
    }
    
}
