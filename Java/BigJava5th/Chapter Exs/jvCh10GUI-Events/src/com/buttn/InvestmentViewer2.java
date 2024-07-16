/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buttn;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pana
 * #PROGRAM 2
 * this program displays the growth of an investment
 */
public class InvestmentViewer2 {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 100;
    
    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //The button to trigger the calculation
        JButton jb = new JButton("Add Interest");
        //The application adds interest to this object 
        final BankAccount objAcc = new BankAccount(INITIAL_BALANCE);
        //The label for displaying the results
        final JLabel jLab = new JLabel("Balance: "+objAcc.getBalance());
        //CONSTRUCT A PANEL TO PUT THE USER-INTERFACE COMPONENTS
        JPanel jPan = new JPanel();
        //construct a frame to put all the components
        JFrame jf = new JFrame();
        jPan.add(jb);
        jPan.add(jLab);
        jf.add(jPan);
        
        //implement listener and event methods
        class AddInterestListener implements ActionListener{
        
           //construct an event to be performed 
            public void actionPerformed(ActionEvent ev){
                double interest = objAcc.getBalance() * INTEREST_RATE /100;
                //call the method to deposit money
                objAcc.depoAmount(interest);
                jLab.setText("Balance: "+objAcc.getBalance());
            }
        
        
        }
        //declare an a listener and give the event to an object
        ActionListener evList = new AddInterestListener();
        jb.addActionListener(evList);
        //display the frame and all its components
        jf.setTitle("Investment Viewer");
        jf.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
