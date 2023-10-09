/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec;
//use impot to use a package of a class without incl.
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;


/**
 *
 * @author Pana
 */
public class comVUT extends JComponent {
    // a component that draws to triangles
    public void paintComponent(Graphics g){
    
        //recover graphics 2D
        Graphics2D g2  = (Graphics2D) g;
        //construct a rectangle and draw it
        Rectangle box = new Rectangle(5,10,20,30);
        g2.draw(box);
        //move the triangle 15 units to the right and 25 units down
        box.translate(15,25);
        //draw the moved triangle
        g2.draw(box);
        
    }
}
