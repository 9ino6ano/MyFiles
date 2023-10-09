/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank;

/**
 *
 * @author Pana
 */
/*
a bank account has a balance that can be changed by deposists or withdrawls
*/
public class BankAccount {
    //instance variable/class object
    private double Balance;
    
    //default constructor = empty object
    public BankAccount(){
    
        Balance = 0;
    }

    //parameterized/override constructor = @parameter
    public BankAccount(double balance) {
        this.Balance = balance;
    }
  
    //deposits money into the bank account
    
    public void depositMoney(double depAmount){
    
        this.Balance += depAmount;
    }
    
    //withdraws money from the bank account
    public void withdMoney(double withAmount){
    
        this.Balance -= withAmount;
    }
    //gets the current balance remaining
    public double getCurrBalance(){
    
        return Balance;
    }
}
