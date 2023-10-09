/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senti.demo;

import java.util.Scanner;

/**
 *
 * @author Pana
 * this program prints the average of salary values that are terminated with a sentinel
 */
public class SentinelDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sum = 0;
        int count = 0;
        double salary = 0;
        
        System.out.println("Enter Salaries, -1 to finish: ");
        Scanner sc = new Scanner(System.in);
        
        //process the data until sentinel is entered
        while(salary != -1){
        
            salary = sc.nextDouble();
            if (salary != -1)
            {
                sum = sum + salary;
                count++;
            }
        }
        //compute and print the average
        if(count > 0){
            double average = sum/count;
            System.out.println("Average Salary: " + average);
        }
        else{
            System.out.println("No data to display.");
        }
    }
    
}
