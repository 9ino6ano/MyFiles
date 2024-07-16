/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec.comp;
import javax.swing.JFrame;
/**
 *
 * @author Pana
 */
public class RectangleViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame jf = new RectangleFrame();
        jf.setTitle("An Animated Rectangle\n [Moves in the X - Y Direction]");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        
    }
    
}
