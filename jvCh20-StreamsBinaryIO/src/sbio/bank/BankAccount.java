/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbio.bank;

/**
 *
 * @author Pana
 */
public class BankAccount {
    private int AccountNumber;
    private double AccountBalance;
    
    public BankAccount(){
        AccountBalance = 0;
        AccountNumber = 0;
    }
     public BankAccount(double aBalance, int aAccNo){
        AccountBalance = aBalance;
        AccountNumber = aAccNo;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int AccNumber) {
        this.AccountNumber = AccNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double AccBalance) {
        this.AccountBalance = AccBalance;
    }
    //CREATE METHOD FOR DEPOSITING INTO AN ACCOUNT
    public void accDeposit(double depAmount){
        AccountBalance += depAmount;
    }
    //CREATE METHOD FROM WITHDRAWING FROM AN ACCOUNT
    public void accDWithdraw(double withAmount){
        AccountBalance -= withAmount;
    }
    
    @Override
    public String toString() {
        return "BankAccount{" + "AccountNumber=" + AccountNumber + ", AccountBalance=" + AccountBalance + '}';
    }
    
    
}
