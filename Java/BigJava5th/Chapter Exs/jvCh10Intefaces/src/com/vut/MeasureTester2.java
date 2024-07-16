/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vut;

import java.awt.Rectangle;

/**
 *
 * @author Pana
 * this program uses interfaces to measure object of another object
 * measurement tester 2 using rectangle class
 * 
 */
public class MeasureTester2 {

    /**
     * @param args the command line arguments
     * this program demonstrates the use of a MEASURE
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Measure areaM = new AreaMeasure();
        
        Rectangle[] objRec = new Rectangle[]
        {
            new Rectangle(5, 10, 20, 30),
            new Rectangle(10, 20, 30, 40),
            new Rectangle(20, 30, 5, 15)
        };
        double avgArea = Data.average(objRec, areaM);
        System.out.println("The Average Area is: " + avgArea);
        System.out.println("The Expected Value is: 625.0");
    }
    
}
