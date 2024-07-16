/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvfrm;
import java.util.Scanner;
import java.util.Stack;
/**
 *THIS CALCULATOR USES THE REVERSE POLISH NOTATION
 * @author Pana
 *
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =  new Scanner(System.in);
        Stack<Integer> results = new Stack<Integer>();
        System.out.println("Enter one number of operator per line, [Q to Quit] :");
        boolean done = false;
        while (!done) {            
            String input = sc.nextLine();
            //if the command is an operator, pop the arguments and 
            //push the result
            if (input.equals("+")) {
                results.push(results.pop() + results.pop());
            }
            else if (input.equals("-")) {
                Integer arg2 = results.pop();
                results.push(results.pop() - arg2);
            }
            else if (input.equals("*") || input.equals("x")) {
                results.push(results.pop() * results.pop());
            }
            else if (input.equals("/")) {
                Integer arg2 = results.pop();
                results.push(results.pop() / arg2);
            }
            else if (input.equals("Q") || input.equals("q")) {
                done = true;
            }
            else{
                //Not an operator - push the input value
                results.push(Integer.parseInt(input));
            }
            System.out.println(results);
            
            
        }
        
        
    }
    
}
