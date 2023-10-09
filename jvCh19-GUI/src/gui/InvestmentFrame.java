/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;

/**
 *
 * @author Pana
 */
public class InvestmentFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONSTRUCT THE FIRST INVESTMENT VIEW
        Investment objInvest = new Investment();
        objInvest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objInvest.setTitle("Investment View 1");
        objInvest.setVisible(true);
        //CONSTRUCT THE SECOND INVESTMENT VIEW
        Investment2 invObj = new Investment2();
        invObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        invObj.setTitle("Investment View 2");
        invObj.setVisible(true);
        
    }
    
}
