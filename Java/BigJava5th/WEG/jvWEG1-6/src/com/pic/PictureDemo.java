/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pic;
import java.lang.Object;
/**
 *
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
        int newWidth = pic.getWidth() - 40;
        int newHeight = pic.getHeight() - 40;
        pic.scale(newWidth, newHeight);
        pic.move(20, 20);
        pic.border(10);
    }
    
}
