/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg.Cash;

/**
 *
 * @author Pana
 */
public class CashRegister {
    //DECLARE CONSTANS AS STATIC ONLY TO BE USED IN THIS CLASS
    public static final double QUATER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;
    //DECLARE INSTANCE VARIABLES TO BE MANIPULATED BY METHODS
    //BASED ON THE USER PREFRERANCE
    private double Purchase;
    private double Payment;
    
    public CashRegister(){
    
        Purchase = 0;
        Payment = 0;
    
    }
  
    /* parameterized consturctor
      public CashRegister(double inPurchase,double inPayment){
    
        Purchase = inPurchase;
        Payment = inPayment;
    
    }
    */
    public void recordPurchae(double purchasePrice){
    
        Purchase = Purchase + purchasePrice;
    }
    public void receivePay(int dollars, int quaters, int dimes, int nickels, int pennies){
    
        Payment = dollars + quaters * QUATER_VALUE +
                dimes * DIME_VALUE + nickels * NICKEL_VALUE+
                pennies * PENNY_VALUE;
    }
    
    public double giveChange(){
    
        double change = Payment - Purchase;
        Purchase = 0;
        Payment = 0;
        return change;
        
    }
    
}
