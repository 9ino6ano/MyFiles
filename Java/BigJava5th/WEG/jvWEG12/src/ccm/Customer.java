/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

/**
 *
 * @author Pana
 */
public class Customer {
    /**
     *A bank customer with a checking and a savings account.
     */
    private int customerNumber;
    private int pin;
    private BankDetails checkingAccount;
    private BankDetails savingsAccount;
            
    public Customer(){
        customerNumber = 0;
        pin = 0;
    }
    /**
     *Constructs a customer with a given number and pin
     * @param aNumber the customer number
     *@param aPin the personal identification number
     */
    public Customer(int aNumber, int aPin){
        this.customerNumber = aNumber;
        this.pin = aPin;
        checkingAccount = new BankDetails();
        savingsAccount = new BankDetails();
    }
    /**
     *Tests if this customer matches a customer number and Pin.
     *@param aNumber a customer number
     *@param aPin a personal identification number
     *@return true if the customeer and pin match
     *
     */
    public boolean match(int aNumber, int aPin){
        return customerNumber == aNumber && pin == aPin;
    }
    /**
     *Gets the checking account of this customer.
     *@return the checking account
     */
    public BankDetails getCheckingAccount(){
        return checkingAccount;
    }
    /**
     *Gets the savings account of this customer.
     *@return the saving account
     */
    public BankDetails getSavingsAccount(){
        return  savingsAccount;
    }
            
    
}
