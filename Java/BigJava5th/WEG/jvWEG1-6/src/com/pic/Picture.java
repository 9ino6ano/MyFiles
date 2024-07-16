/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pic;
import java.util.Objects;
/**
 *
 * @author Pana
 */
public class Picture extends Object{
    private int Width;
    private int Height;
    
    public Picture(){
    }
    public Picture(int aWidth, int aHeight){
     
        this.Width = aWidth;
        this.Height = aHeight;
        
    }
    public int getWidth() {
        return Width;
    }
    public int getHeight() {
        return Height;
    }
    public void scale(int newWidth, int newHeight){
    
    }
    public void border(int width){
    
    }
    public void load(String aSource){
    
    }
    public void move(int dx, int dy){
    
    }
    
}
