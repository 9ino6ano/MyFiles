/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.com;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Pana
 * THE PROGRAM IS FOR ERROR-HANDLING IN THE MAIN METHOD BETWWEN
 * THE readData and readFile methods which just pass exceptions along.
 * 
 * This program reads a file containing numbers and analyzes its contents.
 * If the file doesn't exist or contains strings that are not numbers,
 * an error message should be displayed
 */
public class DataAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DataSetReader reader = new DataSetReader();
        
        boolean done = false;
        while (!done) {            
            
            try {
                System.out.println("Please Enter The File Name: ");
                String fileName = sc.next();
                
                double[] data = reader.readFile(fileName);
                double sum = 0;
                
                for(double d : data){
                    sum = sum + d;
                    System.out.println("The Sum iS: " + sum);
                    done = true;
                }
            } catch (FileNotFoundException ex) {
                System.out.println("The File was not found.");
            }
            catch (BadDataException e){
                System.out.println("Bad data: "+ e.getMessage());
            }
            catch (IOException exp){
                exp.printStackTrace();
            }
        }
        
    }
    
}
