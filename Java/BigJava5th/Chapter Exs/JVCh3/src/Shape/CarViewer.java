/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;
import javax.swing.JFrame;
/**
 *
 * @author Pana
 */
public class CarViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jf = new JFrame();
        jf.setSize(300,400);
        jf.setTitle("Car Viewer");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //construct class component
        CarComponent component = new CarComponent();
        jf.add(component);
        //show the form
        jf.setVisible(true);
        
    }
    
}
