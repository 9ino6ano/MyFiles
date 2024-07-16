/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcha1;

import javax.swing.JOptionPane;

/**
 *
 * @author Pana
 */
public class jvCha1NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programming that prints 3 items, names + movies
        String friend1 = "PanCake Tha DJ";
        String friend2 = "Stouter Panzo";
        String friend3 = "NinoNano Productions";
        
        String movief1 = "Beyond Tha Edge...";
        String movief2 = "Blood In, Blood Out..";
        String movief3 = "Tha Cartipillar's Last Dying Moments...";
        System.out.print("3 Best Friends :"+"\t"+"Favourite Movies: \n"+"------------------------------------------");
        System.out.println(friend1+"||\t"+movief1);
        System.out.println(friend2+"||\t"+movief2);
        System.out.println(friend3+"||\t"+movief3);
        //PROGRAM THAT WRITES A POEM
        System.out.print("A Poet Called $touter For Tha Moment....\n");
        System.out.println("Roses are RED\n Violates are Blue\nEasy as ABC\nCoding in C++,Java or C");
        //Display Us Flag Using = {* + =}
        //Type in and run: Dialog Boxes - message
        JOptionPane.showMessageDialog(null,"Hello $touter,\n How are you this fine day...");
        //Dialog Boxes - Input
        String pName = JOptionPane.showInputDialog("What is Your Name? :");
        System.out.println(pName);
        JOptionPane.showMessageDialog(null, "Hello, " + pName);
        //modified program
        String cName;
        cName = JOptionPane.showInputDialog("Please Enter Your Name: ");
        JOptionPane.showMessageDialog(null, "Hello, "+cName+" ;\nWelcome to Programming 1.0?");
        String cJob;
        cJob = JOptionPane.showInputDialog("What would you like me to do for you? : ");
        JOptionPane.showMessageDialog(null,"I`m Sorry, "+cName+"\nThe system is unable to proceess "+ cJob+ "\n@ the moment.");
        
        
        
    }
    
}
