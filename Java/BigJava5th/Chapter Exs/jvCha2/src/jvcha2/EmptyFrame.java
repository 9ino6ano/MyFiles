/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcha2;
//import swing class = graphics
import javax.swing.JFrame;
/**
 *
 * @author Pana
 */
public class EmptyFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creat frame object
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setTitle("An Empty frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
