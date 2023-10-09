/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;


/**
 *An ATM that access a bank.
 * @author Pana
 */
public class ATM {
    
    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;
    
    private int State;
    private int customerNumber;
    private Customer currentCustomer;
    private BankDetails currentAccount;
    private BankData theBank;
    
    public static final int START = 1;
    public static final int PIN = 2;
    public static final int ACCOUNT = 3;
    public static final int TRANSACT = 4;
    
    /**
     *Constructs an ATM for a given bank.
     *@param abank the bank to whih this ATM connects
     * 
     */
    
    public ATM(BankData aBank){
        theBank = aBank;
        reset();
    }
    public void reset(){
    
        customerNumber = -1;
        currentAccount = null;
        State = START;
    }
    /**
     *Sets the current customer number
     * and sets state to pin.
     * [precondition: state is START]
     *@param number the customer number
     */
    public void setCustomerNumber(int number){
        customerNumber = number;
        State = PIN;
    }
    /**
     *Finds customer in bank.
     * if found sets state to ACCOUNT, else to START.
     *[Precondition: state is PIN]
     *@param pin the PIN of the current customer
     */
    public void selectCustomer(int pin){
        currentCustomer = theBank.findCustomer(customerNumber, pin);
        if (currentCustomer == null) {
            State = START;
        }
        else{
            State = ACCOUNT;
        }
       
    }
    /**
     *Sets current account to checking or savings , sets state to Transact:
     *[Precondition state is ACCOUNT or TRANSACT].
     *@param account one of CHECKING or SAVINGS
     */
    public void selectAccount(int account){
        
        if (account == CHECKING) {
            currentAccount = currentCustomer.getCheckingAccount();
        }else{
            currentAccount = currentCustomer.getSavingsAccount();
        }
        State = TRANSACT;
    }
    /**
     *Withdraws amount from current account.
     *[Precondition : state is TRANSACT]
     *@param value the amount to withdraw
     */
    public void withDraw(double Value){
        currentAccount.withdraw(Value);
    }
    /**
     *Deposits amount to the current account.
     *[Precondition : state to TRANSACT]
     *@param value the amount to deposit
     */
    public void deposit(double Value){
        currentAccount.deposit(Value);
    }
    /**
     *Gets the balance of the current account.
     *[Precondition state to TRANSACT]
     *@return the balance
     */
    public double getBalance(){
        return currentAccount.getBalance();
    }
    /**
     *Move back to the previous state.
     */
    public void back(){
    
        if (State == TRANSACT) {
            State = ACCOUNT;
        }
        else if (State == ACCOUNT) {
            State = PIN;
        }
        else if (State == PIN) {
            State = START;
        }
    }
    /**
     *Gets the current state of this ATM.
     *@return the current state
     */
    public int getState(){
        return State;
    }
    
    
}
