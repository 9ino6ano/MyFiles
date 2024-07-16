/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;
//import all neccessary packages for file access
import java.io.File;
import java.io.PrintWriter;
//import a package to deal with file errors
import java.io.FileNotFoundException;
//import the tools used in file access
import java.util.Scanner;
/**
 *
 * @author Pana
 * The program reads a file with numbers, and writes the numbers
 * to another file, lined up in a column and followed by their total.
 * 
 */
public class Total {

    /**
     * @param args the command line arguments
     */
    //provide the error method when program loads
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
    //prompt for the input file names
        Scanner inCons = new Scanner(System.in);
        System.out.print("Please Enter The Input File: ");
        String inputFileName = inCons.next();
        
    //prompt for the output file names
        System.out.print("Please Enter The Output File: ");
        String outputFileName = inCons.next();
        //CONSTRUCT THE SCANNER AND PRINTWRITER OBJECTS FOR READING/WRITING
        File inputFile = new File(inputFileName);
        Scanner inS = new Scanner(inputFile);
        
        PrintWriter out = new PrintWriter(outputFileName);
        //read the input and write the output
        double total = 0;
        while (inS.hasNextDouble()) {            
            double value = inS.nextDouble();
            out.printf("%15.2f\n", total);
            total = total + value;
            
        }
        //display final total 
        out.printf("Total: %8.2f\n", total);
        //close the read and write
        inS.close();
        out.close();
        
        
    }
    
}
