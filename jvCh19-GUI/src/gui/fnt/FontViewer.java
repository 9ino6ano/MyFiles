/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.fnt;
import javax.swing.JFrame;
/**
 *This program allows the user to view font effects
 * @author Pana
 */
public class FontViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new FontFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Font Viewer");
        frame.setVisible(true);
    }
    
}
