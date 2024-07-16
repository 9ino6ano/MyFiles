/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.fnt.menu;
import javax.swing.JFrame;
/**
 *This program uses the menu to display font effects.
 * @author Pana
 */
public class FontViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jf = new FontFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("Font Viewer");
        jf.setVisible(true);
    }
    
}
