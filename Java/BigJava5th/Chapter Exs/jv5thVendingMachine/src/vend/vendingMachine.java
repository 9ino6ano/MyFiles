/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vend;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pana
 */
public class vendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        
        System.out.print("Enter bill value ( 1 = $1 bill, 5 = $5 bill, etc...): ");
        int billValue = in.nextInt();
        System.out.print("Enter item price in pennies: ");
        int itemPrice = in.nextInt();
        
        //compute the change due
        int changeDue = PENNIES_PER_DOLLAR * billValue - itemPrice;
        int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
        changeDue = changeDue % PENNIES_PER_DOLLAR;
        int quaters = changeDue / PENNIES_PER_QUARTER;
        
        //print the change due
        System.out.printf("Dollar Coins: %6d", dollarCoins);
        System.out.println();
        
        System.out.printf("Quaters: %6d",quaters);
        System.out.println();
        /*
        progame for printing a pair of initials
        */
        System.out.println("+++++++++++++++++++++++");
        System.out.print("Ener your first name: ");
        String first = in.next();
        System.out.print("Ebter Your Significant other's first name: ");
        String Second = in.next();
        //compute the display
        String initials = first.substring(0,1)
                + "&"+ Second.substring(0,1);
        System.out.println(initials);
        //using dialog boxes for input and output
        String input = JOptionPane.showInputDialog("Please Specify The Price: ");
        //th integer.parseINT/double.parseDOUBLE coverts numbers to string
        double price = Double.parseDouble(input);
       
        //show the price accumulated from the input
        JOptionPane.showMessageDialog(null, "Price: " + price);
       
    }
    
}
