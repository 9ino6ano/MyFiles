/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pana
 */
public class ElevatorSimulation {

    /**
     * @param args the command line arguments
     * this is the second addition to the elevator program
     * this elevator panel skips the 13th floor whilst checking for input errors
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Elevator Simulator");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.print("Please Specify a Floor: ");
        //compute if state for floor travel
        if (sc.hasNextDouble()) {// this test if numerical input was entered i.e double
            int floor = sc.nextInt();
            
            if (floor == 13) {
                System.out.println("Error : There is no such floor on this elevator.\nThe is no "+floor+" floor, On this Elevator.");
            }
            else if(floor <= 0 || floor > 20){
                System.out.println("ERROR#\nThe floor No: should be between 1 and 20");
            }else{
                int actualFloor = floor;
                if (floor > 13) {
                    actualFloor = floor - 1;
                }
                System.out.println("The Elevator will be re-directed to the "+actualFloor+" floor.");
            }
        } else{
            System.out.println("Error\nERROR\nERRORerrorERROR\n The Value "+sc.next()+" entered is not an Number");
        }
    //A Basic question program
        System.out.println("___________________________________");
        System.out.println("Supplying  2 inputs with 3 prompts ");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
  
        int count = 0;
        
        do {        
           
        //declare variables and validate if its a no
        System.out.print("Please Enter The 1st No: ");
        int num1 = 0;
        if (!sc.hasNextInt()) 
        {
            //CHECKS WHETHER THE INPUT ENTERED IS VALID
          System.out.println("The Input Entered Is not a Number");
        }
        //IF INPUT IS VALID, THEN ASSIGN VALUE TO A @VAR
        num1 = sc.nextInt();
        
        System.out.print("Please Enter The 2nd No: ");
        int num2 = 0;
        if (!sc.hasNextInt()) 
        {
            System.out.println("The Input Entered Is not a Number");
        }
    
        num2 = sc.nextInt();
     
        System.out.println(num1+" "+num2);// END THE PROGRAM, DISPLAYING TWO NUMBERS
        //##PROGRAM 2 - EXTENTION INTO A CALCULATOR
        //supply arithmatic operations to make the program interesting.
        System.out.println("______BASIC CALC______");
        System.out.println(" [+]_[-]_[x]_[/]_[%]");
        System.out.print("Please specify an arimatic operation: ");
        String ari;
        //DECLARE A STRING AND VALIDATE IF ITS NOT EMPTY AND ITS A VALID STRING
        if (!sc.hasNext())
        {
            System.out.println("Please enter a valid operation.\n from the one's specified above.");   
        }
        //INITIALIZE THE STRING INTO @VAR
        ari = sc.next();

        int arithmat = 0;
        //A SWITCH CASE FOR DETERMING THE STRING INPUT FROM ABOVE
        switch(ari)// THE IF IN THIS CASE REPRESENTS THE HIGHEST/LOWEST VALUE
        {
            case "+": arithmat = num1 + num2;
            break;
            case "-": if (num1 > num2) {
                arithmat = num1 - num2;
                }
            else{
                arithmat = num2 - num1;
            }
            break;
            case "x": arithmat = num1 * num2;
            break;
            case "/": if (num1 > num2) {
                arithmat = num1 / num2;
                }
            else{
                arithmat = num2 / num1;
            }
            break;
            case "%": if (num1 > num2) {
                arithmat = num1 % num2;
                }
            else{
                arithmat = num2 % num1;
            }
            break;
            default: System.out.println("Please enter a valid operation from the list appended.\nArimatic Results in : "+ arithmat);
            break;    
        }
        //DISPLAY SAME MESSAGE FROM 1ST PROGRAM TOGETHTER WITH THE ARIMATIC RESULT FROM THIS PROGRAM
        System.out.println(num1+" "+num2+" = "+arithmat);
        count++;
        } while (count < 5);
        
        System.out.println("Program Terminated....");
        
    }
    
}
