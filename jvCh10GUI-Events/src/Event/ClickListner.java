/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Pana
 * an action listener program that prints a clicked message
 */
public class ClickListner implements ActionListener{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    public void actionPerformed(ActionEvent event){
        System.out.println("I have just been clicked..");
    }
}
