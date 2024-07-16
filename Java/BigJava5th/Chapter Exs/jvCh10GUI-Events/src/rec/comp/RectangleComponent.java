/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec.comp;
//all packages neccessary for drawing and implementing a RECTANGLE
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author Pana
 * this component displays a rectangle that can be moved
 */
public class RectangleComponent extends JComponent{
    //declare constants for Rectangles @parameters
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;
    
    private Rectangle objBox;
    
    public RectangleComponent(){
    //The rectangle that the paintComponent method draws
        objBox = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
    }
    public void paintComponent(Graphics g){
        //retrieve the graphics2D component
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(objBox);
    }
    /*
    @param-dX THE AMOUNT TO MOVE IN THE X-DIRECTION
    @param-dY THE AMOUNT TO MOVE IN THE Y-DIRECTION
    */
    public void moveRectangleBy(int dx, int dy){
        objBox.translate(dx, dy);
        repaint();
    }
}
