/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Random;

/**
 *
 * @author Pana
 * this program simulates a throwing/casting of a dice then times in a row
 */
public class DiceSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Dice dDice = new Dice(6);
       final int triesTHROW = 10;
        for (int i = 0; i <= triesTHROW; i++) {
            int n = dDice.cast();
            System.out.print(n + " ");
            
        }
        System.out.println();
        //program for monte carlo
        /*
        This program computes an estimate of pi by simulating
        a dart, that is thrown onto a square
        */
        final int mTRIES = 10000;
        Random gen2 = new Random();
        int Hits = 0;
        for (int i = 0; i < 10; i++) {
            //generate two random numbers between 1 and -1
            double r = gen2.nextDouble();
            double x = 1 + 2 * r;//between 1 and -1
            r = gen2.nextDouble();
            double y = -1 + 2 * r;
            //check whether the point lies in the unit circle
            if(x * x + y * y <= 1){
                Hits++;
            }
        }
         //the ratio = Hits / tries is an equivalent of 
            //the ratio = circleArea / squareArea = PI/4
            double piEsti = 4.0 * Hits / mTRIES;
            System.out.println("Estimate for PI = "+piEsti);
            
    }
    
    
}
