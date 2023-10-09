/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buttn;
import Event.ClickListner;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Pana
 * this program demonstrates how to install an action listener
 */
public class ButtonViewer {

    // declare local class variables available everywhere = static
    private static final int FWIDTH = 100;
    private static final int FHEIGHT = 60;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //construct a frame for viewing a button
        JFrame jf = new JFrame();
        JButton jbtn = new JButton("Click Me");
        jbtn.setPreferredSize(new Dimension(250,250));
        jf.add(jbtn);
        
        //create a listner for an associated event = click
        ActionListener act_list = new ClickListner();
        jbtn.addActionListener(act_list);
        
        //set frame properties and display it
        jf.setTitle("Basic Click Event");
        jf.setSize(FWIDTH,FHEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        
        
    }
    
}
