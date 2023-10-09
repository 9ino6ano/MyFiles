/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
/**
 *
 * @author Pana
 */
public class Car {
    
    private int xLeft;
    private int yTop;
    
    public Car(int xL, int yT){
        xLeft = xL;
        yTop = yT;
    }
    
    public void paintDRAW(Graphics2D g2){
 
        //draws the body of a car
        /*
        1 - BODY 
        2 - WHEELS
        */
        Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
        Ellipse2D.Double Ftire = new Ellipse2D.Double.Double(xLeft+ 10, yTop + 20, 10, 10);
        Ellipse2D.Double Btire = new Ellipse2D.Double.Double(xLeft+ 40, yTop + 20, 10, 10);
        
        //windshield
        /*
        point of the bottom of windshield
        
        point of the front of the root
        
        point of the rear of the roof
 
        point of the rear windshield
       
        */

        Point.Double r1 = new Point.Double(xLeft + 10, yTop + 10);
        Point.Double r2 = new Point.Double(xLeft + 20, yTop);
        Point.Double r3 = new Point.Double(xLeft + 40, yTop);
        Point.Double r4 = new Point.Double(xLeft + 50, yTop + 10);
        
        Line2D.Double frontWindShield = new Line2D.Double(r1, r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);
        Line2D.Double rearWindShield = new Line2D.Double(r3, r4);
        
        g2.draw(body);
        g2.draw(Ftire);
        g2.draw(Btire);
        g2.draw(frontWindShield);
        g2.draw(roofTop);
        g2.draw(rearWindShield);
        
        
    }
    
}
