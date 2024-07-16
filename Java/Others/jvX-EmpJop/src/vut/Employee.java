/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author Pana
 */
public class Employee {
    public enum Gender{FEMALE,MALE};
    //an enum type class for gender variable
    private String empNumber;
    private String empName;
    //The variable gender is of an gender type class not string
    private Gender empGender;
    //AGGREGATING THE JOB CLASS AS AN OBJECT
    private Job empJob;
    /**
     *This constructor includes an object of the variable job as a parameter
     *ALSO CODE GET / SET METHODS FOR THE JOB INSTRANCE, IN CASE YOU WANT TO MODIFY
     */
    public Employee(String eNo, String eName,Gender eGender,Job eJob){
        setEmpNumber(eNo);
        setEmpName(eName);
        setEmpGender(eGender);
        setEmpJob(empJob);
        
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String eNumber) {
        if (eNumber.length() >= 7 && eNumber.length() <= 10) {
        
            this.empNumber = eNumber;
        }
        else{
        
            throw new IllegalArgumentException("Employee number invalid");
        }
        
        
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String eName) {
        if (eName.length() < 3) {
            throw new IllegalArgumentException("The Name is too Short");
        }
        else{
        
            this.empName = eName;
        }
        
    }

    public Gender getEmpGender() {
        return empGender;
    }

    public void setEmpGender(Gender eGender) {
        this.empGender = eGender;
    }

    public Job getEmpJob() {
        return empJob;
    }

    public void setEmpJob(Job eJob) {
        this.empJob = eJob;
    }

    @Override
    public String toString() {
        return "Employee{" + "empNumber=" + empNumber + ", empName=" + empName + ", empGender=" + empGender + ", empJob=" + empJob + '}';
    }
    
}
