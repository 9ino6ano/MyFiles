/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;
import java.io.*;
/**
 *
 * @author Pana
 */
public class Course implements Serializable{
    private String SubjName;
    private double SubjPrice;

    public Course() {
    
        this.SubjName = "";
        this.SubjPrice = 0.0;
    }
    //create an equals method to test 
    public boolean equals(Course objC){
        return (this.SubjName.equals(objC.SubjName)&& this.SubjPrice == objC.SubjPrice);
    }

    public Course(String SName, double SPrice) {
        //this.SubjName = SubjName;
        //this.SubjPrice = SubjPrice;
        setSubjName(SName);
        setSubjPrice(SPrice);
    }

    public String getSubjName() {
        return SubjName;
    }

    public void setSubjName(String SubjName) {
        this.SubjName = SubjName;
    }

    public double getSubjPrice() {
        return SubjPrice;
    }

    public void setSubjPrice(double SubjPrice) {
        this.SubjPrice = SubjPrice;
    }

    
    @Override
    public String toString() {
        return "Course{" + "SubjName=" + SubjName + ", SubjPrice=" + SubjPrice + '}';
    }
    
}
