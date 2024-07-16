/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank;

/**
 *
 * @author Pana
 * a class to monitor the growth of an investment that accumulates
 * interest at a fixed annual rate.
 */
public class Investment {
    //instantiate the instance variables
    private double Balance;
    private double Rate;
    private int Year;
    
    //constructs an Investment object from a starting balance and interest rate
    //@param = balance {the starting balance}
    //@param = interest rate (the interest accumulated over a period of time)
    public Investment(double iBalance,double iRate){
        this.Balance = iBalance;
        this.Rate = iRate;
        this.Year = 0;
    }
    /*
    keeps accumulating interest until the target balance has been reached.
    @parameter = target balance
    */
    public void waitForBalance(double targetBalance){
    
        while (Balance < targetBalance) {            
            
            Year++;
            double accInterest = Balance * Rate/100;
            Balance = Balance + accInterest;
        }
    }
    //this method accumulates the number of years it takes for the 
    //balance to double
    public void waitYears(int noOfYears){// the number of years to wait
    
        for (int i = 0; i < noOfYears; i++) {
            
            double interest = Balance * Rate / 100;
            Balance = Balance + interest;
        }
        Year = Year + noOfYears;
    }
    /*
    returns the current investment balance
    */
    public double getBalance(){
        
        return Balance;
    
    }
    //gets the number of years , this account has been accumulating interest
    public int getYears(){
    
        return Year;
    }
    
    
    
    
    
    
    
    
}
