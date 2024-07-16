/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pyramiid;

/**
 *
 * @author Pana
 */
public class PyramidDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pyramid sample = new Pyramid(10, 10);
        System.out.println(sample.getVolume());
        System.out.println("Expected: 333.33");
        System.out.println(sample.getSurfaceArea());
        System.out.println("Expected: 224");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*");
        Pyramid gizeh = new Pyramid(146, 230);
        System.out.println(gizeh.getVolume());
        System.out.println("Expected: 2500000");
        
    }
    
}
