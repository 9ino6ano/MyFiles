/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cc;

/**
 *Thsi program removes spaces and dashes from a credit card number
 * @author Pana
 */
public class CCNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        String creditCardNumber = "4123-5678-9012-3450";
        System.out.println("Credit Card Processing");
        System.out.print("Credit Card before: ");
        System.out.println(creditCardNumber);
        int i = 0;
        while (i < creditCardNumber.length()) {            
            char ch = creditCardNumber.charAt(i);
            if (ch == ' '|| ch == '-') {
                //remove the character at position i
                String before = creditCardNumber.substring(0, i);
                String after = creditCardNumber.substring(i + 1);
                creditCardNumber = before + after;
                
            }
            else{
                i++;
            }
        }
        System.out.print("Credit Card After: ");
        System.out.println(creditCardNumber);
    }
    
}
