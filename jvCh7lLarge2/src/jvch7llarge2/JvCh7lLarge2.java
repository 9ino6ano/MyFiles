/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvch7llarge2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Pana
 */
public class JvCh7lLarge2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //##program 2 the lagest in the array list
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();
        //read the inputs
        System.out.println("Program 2: \n");
        System.out.print("Please Enter Values, Q to Quit: ");
        while (sc.hasNextDouble()) {            
           numbers.add(sc.nextDouble());
        }
        //find the largest value
        double large = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)> large) {
                large = numbers.get(i);
            }
        }
        //prints all the values, marking the largest
        for(double element : numbers){
            System.out.print(element);
            if (element == large) {
                System.out.println("  <== is the largest value.");
            }
            System.out.println();
        }
    }
    
}
