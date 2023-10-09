/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcom;

//import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author Pana
 */
public class DebugFileview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Yasho Yasho");
        System.out.println("Result is : "+78 * 3);
        String[] arrAnimals = {"Dog","Cat","Bird","Bee","Fish"};
        for (int i = 0; i < arrAnimals.length; i++) {
              System.out.print("Animals is : ");
              System.out.println(arrAnimals[i]);
        }
        System.out.println("*-*-*-*-Accepting Input from the user-*-*-*-*");
        Scanner sc = new Scanner(System.in);
        String Name = "",Skill = "";
        int Age = 0;
       
        System.out.print("Please tell us your name: ");
            Name = sc.nextLine();
            System.out.print("What is Your Skill ? ");
            Skill = sc.nextLine();
            System.out.print("How Old Are You ?");
            Age = sc.nextInt();
        System.out.println("Hello "+Name+", Welcome to 9ino6ano.\nYour Skill is "+Skill+" & You are "+Age+" years old.");
    }
    
}
