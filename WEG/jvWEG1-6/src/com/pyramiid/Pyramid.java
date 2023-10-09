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
public class Pyramid {
    private double Height;
    private double BaseLength;
    
    public Pyramid(double pHeight, double pBaseLength){
    
        this.Height = pHeight;
        this.BaseLength = pBaseLength;
    }
    public double getVolume(){
        return Height * BaseLength * BaseLength / 3;
    }
    public double getSurfaceArea(){
       double sideLength = Math.sqrt(Height * Height + BaseLength * BaseLength / 4);
       return 2 * BaseLength * sideLength;
    }
}
