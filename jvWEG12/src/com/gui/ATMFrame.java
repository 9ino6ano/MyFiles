/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;
import ccm.ATM;
import ccm.BankData;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Pana
 */
public class ATMFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ATM objATM;
        try {
            BankData objBank = new BankData();
            objBank.readCustomers("customers.txt");
            objATM = new ATM(objBank);
            
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Error opening the account file." + ex.getMessage());
            return;
        }
        JFrame jf =  new ATMViewer(objATM);
        jf.setTitle("First National Bank Of JAVA");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        
    }
    
}
