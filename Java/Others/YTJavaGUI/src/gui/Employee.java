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
public class Employee implements Serializable{
    //Declare instance of employee class
    private String Name;
    private String Surname;
    private Job empJob;
    private int staffNumber;
    
    //constructs a new employee

    public Employee(String eName, String eSurname, Job eJob, int sNumber) {
        this.Name = eName;
        this.Surname = eSurname;
        this.empJob = eJob;
        this.staffNumber = sNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String eName) {
        this.Name = eName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String eSurname) {
        this.Surname = eSurname;
    }

    public Job getEmpJob() {
        return empJob;
    }

    public void setEmpJob(Job eJob) {
        this.empJob = eJob;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int sNumber) {
        this.staffNumber = sNumber;
    }
    
}
