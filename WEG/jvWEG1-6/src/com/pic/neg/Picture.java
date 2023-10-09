/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pic.neg;

import java.awt.Color;

/**
 *The implementation of the Picture class uses the java image library
 * @author Pana
 */
public class Picture {
    private int Width;
    private int Height;
    
    public Picture(){
        Width = 0;
        Height = 0;
    }
    public Picture(int aWidth, int aHeight){
    
        this.Width = aWidth;
        this.Height = aHeight;
        
    }
    /**
     *Gets the Width of this picture.
     * @return the Width
     */
    public int getWidth() {
        return Width;
    }
    /**
     *Gets the height of this picture.
     * @return the Height
     */
    public int getHeight() {
        return Height;
    }
    /**
     *LOADS A PICTURE FROM A GIVEN SOURCE
     *@param source the image source. If the source starts with http:// = a url , otherwise its a filename
     */
    public void load(String source){
        /**
         *Gets the color of a pixel.
         *@param x the column index [Between 0 and getWidth() - 1]
         *@param y the row index (Between 0 and getHeight() - 1)
         *@return the color of the pixel at position(x,y)
         */
    }
    public Color getColor(int x, int y){
        /**
         *Gets the color at pixel.
         *@param x the column index(Between 0 and getWidth() - 1)
         *@param y the column index (Between 0 and getHeight() - 1)
         *@return the color of the pixel at position(x,y)
         */
        Color c = new Color(x);
        return c;
    }
    public void setColorAt(int x, int y, Color c){
    
        /**
         *Sets the color of a pixel.
         *@param x the column index(Between 0 and getWidth() - 1)
         *@param y the row index (Between 0 and getHeight() - 1)
         *@param c the color for the pixel at position(x,y)
         */
    }
    
}
