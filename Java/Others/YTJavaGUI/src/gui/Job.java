/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.io.*;
/**
 *
 * @author Pana
 */
public class Job implements Serializable{
    //create instances of the job
    private double Salary;
    private String NameOfJob;
    
    public Job(double jSalary, String jName){
    
        this.Salary = jSalary;
        this.NameOfJob = jName;
    }

    //Create a method for testing match between entered data and database
    public boolean equals(Job objJob){
    /**
     *The Problem with this code, is causes redundancy = omit if statement
     * if(this.Salary == objJob.Salary && this.NameOfJob.equals(objJob.NameOf Job))
     * { return true }
     * else
     * { return false}
     */
        return(this.Salary == objJob.Salary && this.NameOfJob.equals(objJob.NameOfJob));
    }
    //Create accessors and mutators for the instances
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double jSalary) {
        this.Salary = jSalary;
    }

    public String getNameOfJob() {
        return NameOfJob;
    }

    public void setNameOfJob(String jName) {
        this.NameOfJob = jName;
    }
    
}
