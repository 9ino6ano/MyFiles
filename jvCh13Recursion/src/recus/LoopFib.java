/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recus;

import java.util.Scanner;

/**
 *
 * @author Pana
 * This program imitates the pencil and pen method for 
 * computing the Fibonacci sequence
 */
public class LoopFib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // This program computes Fib(No using an iterative method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            long f = fib(i);
            System.out.println("fib(" + i + " ) = " + f);
        }
     /*
        Computes a fibonacci number
        @param = n as an integer
        @return = the nth Fibonacci No.
        */   
     
    }
    public static long fib(int n){
        if (n <= 2) {
            return 1;
        }
        else{
        long oldValue = 1;
        long preValue = 1;
        long newValue = 1;
        
            for (int i = 3; i <= n; i++) {
                newValue = oldValue + preValue;
                oldValue = preValue;
                preValue = newValue;
            }
            return newValue;
        }
    }
    // this method returns much faster than the other 2
    // the iterative/recursive methods have the same process
    // just that the recursive solution because it follows a maths expression is slower
    // the iteractive solution computes intermediate results multiple times.
}
