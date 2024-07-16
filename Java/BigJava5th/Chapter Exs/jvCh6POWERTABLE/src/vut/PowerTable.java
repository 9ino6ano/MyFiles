/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author Pana
 * this program prints out the powers of x
 */
public class PowerTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //declare constants to be used in the program
        final int NMAX = 4;
        final double XMAX = 10;
        
        //PRINT THE TABLE HEADERS
        for (int n = 0; n <= 10; n++) {
            System.out.printf("%10d",n);
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%10s","x ");
        }
        System.out.println();
        //print the table body
        for (double x = 0; x <= 10; x++) {
            //print the table row
            for (int n = 0; n <= 10; n++) {
            System.out.printf("%10.0f",Math.pow(x, n));
            
            }
            System.out.println();
        }
    }
    
}
