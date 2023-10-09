/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author Pana
 */
public class BankAccount implements Measurable{//,Comparable{
    
 
    private String Acc_Name;
    private int Acc_Number;
    private double Acc_Balance;
    
    public BankAccount(double accBal){
        Acc_Name = "";
        Acc_Number = 0;
        Acc_Balance = accBal;
    }
    public BankAccount(String aName, int aNo, double aBalance){
        Acc_Name = aName;
        Acc_Number = aNo;
        Acc_Balance = aBalance;
    }

    public String getAcc_Name() {
        return Acc_Name;
    }

    public void setAcc_Name(String AccName) {
        this.Acc_Name = AccName;
    }

    public int getAcc_Number() {
        return Acc_Number;
    }

    public void setAcc_Number(int AccNum) {
        this.Acc_Number = AccNum;
    }

    public double getAcc_Balance() {
        return Acc_Balance;
    }

    public void setAcc_Balance(double AccBal) {
        this.Acc_Balance = AccBal;
    }
    // the method to implement the interface
    public double getMeasure(){
        return Acc_Balance;
    }
    public double getLarger()
    {
        return Acc_Balance;
    }
    //this method implements the compabarable interface
  
   
   /*
      public int compareTo(Object otherObject){
       BankAccount other = (BankAccount) otherObject;
       if (Acc_Balance < other.Acc_Balance) {
           return -1;
       }else if(Acc_Balance > other.Acc_Balance){
           return 1;
       }
       else
       {
           return 0;
       }
    }
    */    
   
    
   

    }

