/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 *
 * @author Pana
 */
public class EmployeeJob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String jTitle;
        String jDept;
        System.out.print("Please Enter The Department At which You Work? :");
        if (!sc.hasNextLine()) {
            throw new IllegalArgumentException("Please Specify The Department");
        }
        else{
            jDept = sc.nextLine();
        }
        System.out.print("Please Enter Your Job Title/Description? : ");
        if (!sc.hasNextLine()) {
            throw new IllegalArgumentException("Please Enter The Job Title");
        }else{
            jTitle = sc.nextLine();
        }
        Job objJob = new Job(jTitle, jDept);
        System.out.println(objJob.toString());
        System.out.println("*-*-*-*-*The Employee Program*-*-*-*-*");
        String empName,empNo;
        Employee.Gender eGender = null;
        System.out.print("What is Your Name: ");
        if (sc.hasNextLine()) {
            empName = sc.nextLine();
        }
        else{
            throw new IllegalArgumentException("Please Enter Your Details.\nWhat is Your Name? :");
        }
        System.out.print("Hello "+empName+", Welcome To 9ino6ano\nWhat is Your Job Employee No? :");
        if (sc.hasNextLine()) {
            empNo = sc.nextLine();
        }
        else{
            throw new IllegalArgumentException(empName+", Please specify the appropriate Employee No.");
        }
        System.out.print(empName+", Please Specify Your Sex/Gender? :");
        if (sc.hasNextLine()) {
            
            if (sc.nextLine().equalsIgnoreCase("Male")) {
                eGender = Employee.Gender.MALE;
            }
            else if (sc.nextLine().equalsIgnoreCase("Female")) {
                eGender = Employee.Gender.FEMALE;
            }
            else{
                System.out.println("Please Enter Male of Female");
            }
        }
        else{
            throw new IllegalArgumentException("Please enter an appropriate gender.\nEither Male or Female.");
        }
        if (!empNo.isEmpty()&& !empName.isEmpty()) {
            Employee objEmployee = new Employee(empNo, empName, eGender, objJob);
        System.out.println("-+-+-+-+-Display Employee-+-+-+-+-");
        System.out.println(objEmployee.toString());
        }
        else
        {
            throw new IllegalArgumentException(empName+" ,The is no such employee in this compamy, \n with this Employee No: "+empNo);
        }
       
    }
    
}
