/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;
import ccm.ATM;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 *A frame displaying the components of an ATM
 * @author Pana
 */
public class ATMViewer extends JFrame{//THE ATM FRAME
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    
    private JButton aButton;
    private JButton bButton;
    private JButton cButton;
    
    private Keypad pad;
    private JTextArea display;
    private ATM objATM;
    /**
     *Constructs the user interface of the ATM Frame
     */
    public ATMViewer(ATM aATM){
        objATM = aATM;
        //construct ocmponenets
        pad = new Keypad();
        display = new JTextArea(4,20);
        aButton = new JButton(" A ");
        aButton.addActionListener(new AButtonListener());
        bButton = new JButton(" B ");
        bButton.addActionListener(new BButtonListener());
        cButton = new JButton(" C ");
        cButton.addActionListener(new CButtonListener());
        //add components
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(aButton);
        buttonPanel.add(bButton);
        buttonPanel.add(cButton);
        
        setLayout(new FlowLayout());
        add(pad);
        add(display);
        add(buttonPanel);
        showState();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }
    /**
     *Updates the display message.
     */
    public void showState(){
        int state = objATM.getState();
        pad.clear();
        if (state == ATM.START) {
           display.setText("Enter customer number\nA = Ok");
        }
        else if (state == ATM.ACCOUNT) {
            display.setText("Enter Pin\n A = Ok");
        }
        else if (state == ATM.TRANSACT) {
            display.setText("Select Account"+
                    "\nEnter Amount and Select Transaction\n"+
                    "A = Withdrawl\nB = Deposit\nC = Cancel");
        }
        
    }
    class AButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int state = objATM.getState();
            if (state == ATM.START) {
                objATM.setCustomerNumber((int) pad.getValue());
            }
            else if (state == ATM.PIN) {
                objATM.setCustomerNumber((int) pad.getValue());
            }
            else if (state == ATM.ACCOUNT) {
                objATM.selectAccount(ATM.CHECKING);
            }
            else if (state == ATM.TRANSACT) {
                objATM.withDraw(pad.getValue());
                objATM.back();
            }
            showState();
        }
    }
    class BButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int state = objATM.getState();
            if (state == ATM.ACCOUNT) {
                objATM.selectAccount(ATM.SAVINGS);
            }else if (state == ATM.SAVINGS) {
                objATM.deposit(pad.getValue());
                objATM.back();
            }
            showState();
        }
    }
    class CButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int state = objATM.getState();
            if (state == ATM.ACCOUNT) {
                objATM.reset();
            }else if (state == ATM.TRANSACT) {
                objATM.back();
            }
            showState();
        }
    }
}
