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
public class InvestmentProgram {

    /**
     * @param args the command line arguments
     * this program computes how long it takes for an investment to double
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // First Program Test
        final double INITIAL_BALANCE = 10000;
        final double RATE = 5;
        Investment objInv = new Investment(INITIAL_BALANCE, RATE);
        objInv.waitForBalance(2*INITIAL_BALANCE);
        int years = objInv.getYears();
        System.out.println("The Investment doubled after "+years+" years.");
        
        //Second Program Test
        final double IN_BALANCE2 = 10000;
        final double RATE2 = 5;
        final int YEARS = 20;
        
        Investment objInv2 = new Investment(INITIAL_BALANCE, RATE);
        objInv2.waitForBalance(YEARS);
        double balance = objInv2.getBalance();
        //objInv.waitForBalance(2*INITIAL_BALANCE);
        //int year2 = objInv2.getYears();
        //System.out.println("The Investment doubled after "+year2+" years.");
        System.out.printf("The balance after %d years is %.2f\n",YEARS,balance);
        
        
    }
    
}
