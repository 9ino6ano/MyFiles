/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm;

/**
 *
 * @author Pana
 */
public class MenuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu mainMenu = new Menu();
        mainMenu.addOption("Open New Account");
        mainMenu.addOption("Log Into Existing Account");
        mainMenu.addOption("Help");
        mainMenu.addOption("Quit");
        mainMenu.display();
    }
    
}
