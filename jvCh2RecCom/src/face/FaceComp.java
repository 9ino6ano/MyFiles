/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package face;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
/**
 *
 * @author Pana
 */
public class FaceComp extends JComponent {

    //create the paint method
    public void paintComp(Graphics g){
    
    //recover the graphics2D
    Graphics2D g2 = (Graphics2D) g;
    
    //draw the head
    Ellipse2D.Double head = new Ellipse2D.Double(5,10,20,30);
    g2.draw(head);
    //draw the eyes
    g2.setColor(Color.GREEN);
    Rectangle eye  = new Rectangle(25,70,15,15);
    g2.fill(eye);
    g2.translate(20, 0);
    g2.fill(eye);
    //draw the mouth
    Line2D.Double mouth = new Line2D.Double(30, 110, 80, 110);
    g2.setColor(Color.RED);
    g2.draw(mouth);
    //draw the greeting
    g2.setColor(Color.BLUE);
    g2.drawString("Hello 9ino6ano To the World!!",5,175);
  
    }
}
