/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recus;

import java.util.Scanner;
import sun.org.mozilla.javascript.internal.Evaluator;

/**
 *
 * @author Pana
 * As with any recursive methods, ensure that the recursion terminates
 * At each recursive call some of the tokens of the input string are consumed
 * so eventually the recursion must come to an end.
 */
public class Elevator {
    //A class that can compute the value of an arithmatic expression
    private ExpressionTokenizer eTokenizer;
    /**
     * @param args the command line arguments
     *Constructs an elevator
     * @param anExpression a string containing the expression to be evaluated
     */
    public Elevator(String anExpression){
        eTokenizer = new ExpressionTokenizer(anExpression);
    }
    /*
    Evaluates the expression.
    @return = value of the expression
    */
    public int getExpressionValue(){
        int value = getTermValue();
        boolean done = false;
        while (!done) {            
            String next = eTokenizer.peekToken();
            if ("+".equals(next) || "-".equals(next)) {
                eTokenizer.nextToken();//Discard "+" OR "-"
                int value2 = getTermValue();
                if ("+".equals(next)) {
                    value = value + value2;
                }
                else{
                    done = true;
                }
                
            }
        }
        return value;
               
    }
    //Evaluates the next term found in the expression.
    //@RETURN = the value of the term
    public int getTermValue(){
        int value = getFactorValue();
        boolean done = false;
        while (!done) {            
            String next = eTokenizer.peekToken();
            if ("*".equals(next) || "/".equals(next)) {
                eTokenizer.nextToken();
                int value2 = getFactorValue();
                if ("*".equals(next)) {
                    value = value * value2;
                }
                else{
                    value = value / value2;
                }
            }
            else{
                done = true;
            }
        }
        return value;
    }
    /*
    Evaluates the next factor found in the expression.
    @return = the value of the factor
    */
    public int getFactorValue(){
    
        int value;
        String next = eTokenizer.peekToken();
        if ("(".equals(next)) {
            eTokenizer.nextToken();// Discard the "("
            value = getExpressionValue();
            eTokenizer.nextToken();//Discard the other ")"
                
        }
        else{
            value = Integer.parseInt(eTokenizer.nextToken());
        }
        return value;
    }
    /*
    This class Breaks up a strng describing an expression
   
    into token: numbers: parenthesis and operators
    */
    public class ExpressionTokenizer{
        private String input;
        private int start;// The start of the Current token
        private int end; // The position after the end of the current 
    
        /*
        Constructs a tokenizer
        @param = anInput ; THE STRING TO BE TOKENIZED
        */
        public ExpressionTokenizer(String anInput){
            input = anInput;
            start = 0;
            end = 0;
            nextToken();//Find the first token
        }
        //Peaks at the next token without consuming it
        //@return = the next token or null if there is no more tokens
        public String peekToken(){
        
            if (start >= input.length()) {
                return null;
            }
            else
            {
                return input.substring(start,end);
            }
        }
        /*
        Get the next token and moves the tokenizer to the following token
        @return = the next token or null if there are no more tokens
        */
        public String nextToken(){
        
            String r = peekToken();
            start = end;
            if (start >= input.length()) {
                return r;
            }
            if (Character.isDigit(input.charAt(end))) {
                end = start + 1 ;
                while (end < input.length()&& Character.isDigit(input.charAt(end))) {                    
                    end++;
                }
            }
            else{
                end = start + 1;
            }
            return r;
        }  
        
    }
        /*
        This program calculates the value of an expression
        consisting of numbers, arithmatic operatiors and parenthesis
        */  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Expression: ");
        String input = sc.nextLine();
        Elevator e = new Elevator(input);
        
        int value = e.getExpressionValue();
        System.out.println(input+" = "+value);
        
    }
    
}
