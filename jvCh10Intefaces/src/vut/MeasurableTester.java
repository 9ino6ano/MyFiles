/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author Pana
 * this program demonstrates the measurable bank account and country class
 */
public class MeasurableTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Measurable[] objAcc = new Measurable[3];
        objAcc[0] = new BankAccount(0);
        objAcc[1] = new BankAccount(10000);
        objAcc[2] = new BankAccount(2000);
        
        double avgBankBal = DataMeasure.average(objAcc);
        System.out.println("Your Averang Balance is:   R"+avgBankBal);
        System.out.println("The Expected Value is:   R4000");
        
        Measurable[] objCounts = new Measurable[3];
        objCounts[0] = new Country("Zambia",176220);
        objCounts[1] = new Country("Jamaica",513120);
        objCounts[2] = new Country("Malaysia",30510);
        
        double avgCouArea = DataMeasure.average(objCounts);
        System.out.println("The Average Area is:   h.a "+ avgCouArea);
        System.out.println("The Expected Area is:   h.a 239_950");
        System.out.println("______________________________________");
//- the program for converting from classes to interfaces        
//2-the program for casting from interfaces to classes
        System.out.println("-+-+-+-+-+-+Program 2+-+-+-+-+-++-+-");
        
        Country objCountry1 = new Country("Ethiopia", 176220);
        Country objCountry2 = new Country("England", 513120);
        Measurable max = DataMeasure.larger(objCountry1, objCountry2);
        
        Country maxCounty = (Country) max;
        String max_Country_Name = maxCounty.getCountry_Name();
        System.out.println("The Max getween: "+objCountry1.getCountry_Name()+ " & "+objCountry2.getCountry_Name()+"\n");
        System.out.println(objCountry1.getCountry_Name()+": Has an area of "+ objCountry1.getCountry_Area()+"\n"+
                            objCountry2.getCountry_Name()+": Has an area of "+ objCountry2.getCountry_Area());
        System.out.println("The Max is: "+ max_Country_Name);
        
        
        
        
        
    }
    
}
