/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Pana
 * this component construct an object that will create a template for another object
 */
public class CarComponent extends JComponent {
    
    //create paint method for the obhect
    public void paintComp(Graphics g){
    //recover the graphics2d
        Graphics2D g2 = (Graphics2D) g;
    //construct object template and draw it
        Car Car1  = new Car(0,0);
        
       //initialise the class variables
        int x = getWidth() - 60;
        int y = getWidth() - 30;
        
        Car Car2  = new Car(x,y);
        
        Car1.paintDRAW(g2);
        Car2.paintDRAW(g2);
    }
}
