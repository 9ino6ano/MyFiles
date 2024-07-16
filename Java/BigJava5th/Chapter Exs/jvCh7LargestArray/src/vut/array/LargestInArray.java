/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pana
 * this program reads a sequence of values
 * then prints the largest value of that sequence
 */
public class LargestInArray {

    //THE ADDITIONAL PROGRAM INTRODUCES ARRAY LISTS
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declare constants
        final int LENGTH = 100;
        //declare the array = data type
        double[] values = new double[LENGTH];
        int currSize = 0;
        //read the inputs
        System.out.println("Please Enter Values, [Q to Quit] : ");
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextDouble() && currSize < values.length) {            
            values[currSize] = sc.nextDouble();
            currSize++;
        }
       //method for determining the largest value
        double largerst = values[0];
        for (int i = 0; i < currSize; i++) {
            if (values[i] > largerst) {
                largerst = values[i];
            }
        }
        //prints all the values, by making 1 value the largest
        for (int i = 0; i < currSize; i++) {
            System.out.print(values[i]);
            if (values[i] == largerst) {
                System.out.print(" <== Largest Value.");
            }
            System.out.println();
        }
    }
    
}
