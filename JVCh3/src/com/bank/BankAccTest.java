/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank;

/**
 *
 * @author Pana
 * a class to test the bank account class
 */

public class BankAccTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount objBA  = new BankAccount();
        objBA.depositMoney(2000);
        objBA.withdMoney(500);
        System.out.print("Bank Statement: \n");
        System.out.println(objBA.getCurrBalance());
        System.out.println("Expected : 1500\t{bal = 2000 - 500}");
        
        
    }
    
}
