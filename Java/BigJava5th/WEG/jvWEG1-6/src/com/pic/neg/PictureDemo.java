/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pic.neg;
import java.awt.Color;
/**
 *The following program solves our image manipulation problem.
 * @author Pana
 */
public class PictureDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Picture pic = new Picture();
        pic.load("");
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < pic.getHeight(); y++) {
            Color original = pic.getColor(x, y);
            Color negative = new Color(255 - original.getRed(),
            255 - original.getGreen(),
            255 - original.getBlue());
            pic.setColorAt(x, y, negative);
            
        }
            
        }
    }
    
}
