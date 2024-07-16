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
 * This Program inserts trace messages into the method
 */
public class RecursiveFibTester {

    /**
     * @param args the command line arguments
     * This program prints trace messages that show how often
     * the Recursive method for computing Fibonacci numbers calls itself.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int no = in.nextInt();
        long f = fib(no);
        System.out.println("fib("+ no + ") = "+ f);
        
    }
    /*
    computes a Fibonacci number
    @param  n as an integer
    @return = the nth fibonacci number
    */
    public static long fib(int n){
        System.out.println("Entering Fib:: No.= "+ n);
        long f;
        if (n <= 2) {
            f = 1;
        }
        else{
            f = fib(n - 1)+fib(n - 2);
        }
        System.out.println("Exiting fib: No.= "+ n + " return value = "+f);;
        return f;
    }
    
}
