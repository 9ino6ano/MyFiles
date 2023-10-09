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
public class Country implements Measurable{
    private String Country_Name;
    private double Country_Area;
    
    public Country(){
        Country_Name = "";
        Country_Area = 0;
    }
    public Country(String aCountryName, double aCountryArea){
        Country_Name = aCountryName;
        Country_Area = aCountryArea;
    }

    public String getCountry_Name() {
        return Country_Name;
    }

    public void setCountry_Name(String c_Name) {
        this.Country_Name = c_Name;
    }

    public double getCountry_Area() {
        return Country_Area;
    }

    public void setCountry_Area(double c_Area) {
        this.Country_Area = c_Area;
    }
    //Method that implements an interface
    public double getMeasure(){
        return Country_Area;
    }
    public double getLarger(){
        return Country_Area;
    }

    @Override
    public String toString() {
        return "Country{" + "Country_Name=" + Country_Name + ", Country_Area=" + Country_Area + '}';
    }
    
    
    
}
