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
 * This program computes the Fibonacci sequence
 * using numbers in a recursive method
 */
public class RecursiveFib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            long f = fib(i);
            System.out.println("Fibo("+i+") = "+f);
        }
        
    }
    public static long fib(int n){
        if (n <= 2) {
            return 1;
        }
        else
        {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
}
