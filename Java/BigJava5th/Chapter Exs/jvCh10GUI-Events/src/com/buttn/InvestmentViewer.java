/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buttn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Pana
 * this program demonstrates how an action listener can access
 * a variable surrounding a block
 */
public class InvestmentViewer {

    //provide class to be manipulated in the event
    //public class BankAccount{}
    //declare constants to be manipulated by an event
    //declare instance to be used in the event
    private static final int frameWIDTH = 120;
    private static final int frameHEIGHT = 60;
    
    private static final double interestRATE = 10;
    private static final double initialBALANCE = 1000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declare frame to add the button on
        JFrame jf = new JFrame();
        //The button to trigger the calculation
        JButton jb = new JButton("Add Interest");
        // The application adds interest to this bank account
        final BankAccount objAccount = new BankAccount(initialBALANCE);
        //AN INTERFACE THAT DECLARES AN EVENT
        class AddInterestListner implements ActionListener{
        
            public void actionPerformed(ActionEvent event){
            
                //this listner method accesses the account variable
                //from the surrounding block
                double interest = objAccount.getBalance() * interestRATE/100;
              
               
              
               
                objAccount.depoAmount(interest);
                System.out.println("Balance : R"+objAccount.getBalance());
                
                
            }
        
        }
        //add listener to the button
        ActionListener actList = new AddInterestListner();
        jb.addActionListener(actList);
        //display the frame
        jf.add(jb);
        jf.setSize(frameWIDTH,frameHEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
