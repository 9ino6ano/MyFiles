/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcha2;
import java.awt.Rectangle;
//create an rec class
/**
 *
 * @author Pana
 */
public class MoveRec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle box = new Rectangle(5, 10, 20, 30);
        //code for moving the rectangle
        box.translate(15, 25);
        //print info , showing indeed the Rec did move
        //X
        System.out.print("x: ");
        System.out.println(box.getX());
        System.out.println("Expected Result: 20");
        //Y
        System.out.print("y: ");
        System.out.println(box.getY());
        System.out.println("Expected Result: 35");
        
        
    }
    
}
