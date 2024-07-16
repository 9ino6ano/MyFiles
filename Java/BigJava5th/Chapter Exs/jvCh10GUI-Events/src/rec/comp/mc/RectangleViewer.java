/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec.comp.mc;
import javax.swing.JFrame;
/**
 *
 * @author Pana
 * this program displays a triangle that can be moved with a mouse
 */
public class RectangleViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jf = new RectangleFrame();
        jf.setTitle("A Program that simulates a triangle moved by ");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
}
