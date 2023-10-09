/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

/**
 *A bank account has a balance that can be changed by deposits and withdrawls
 * @author Pana
 */
public class BankDetails {//bank acc
    
    private double Balance;
    
    public BankDetails(){
        Balance = 0;
    }
    /**
     *Constructs a bank account with a given balance.
     *@param initialBalance the initial balance
     */
    public BankDetails(double initialBalance){
        Balance = initialBalance;
    }
    /**
     *Deposits money into the account.
     *@param amount the amount of money to withdraw
     */
    public void deposit(double amount){
        Balance = Balance + amount;
    }
    /**
     *Withdraws money from the account.
     *@param amount the amount of money to draw
     */
    public void withdraw(double amount){
        Balance = Balance - amount;
    }
    /*
    Gets the account balace
    */
    public double getBalance(){
        return Balance;
    }
    
}
