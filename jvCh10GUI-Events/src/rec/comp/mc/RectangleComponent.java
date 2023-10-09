/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec.comp.mc;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
/**
 *
 * @author Pana
 * the component displays a rectangle that can be moved
 */
public class RectangleComponent extends JComponent{
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;
    
    private Rectangle objRec_Box;
    
    public RectangleComponent(){
        // the rectangle that the paintComponent method draws
        objRec_Box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
    }
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(objRec_Box);
    }
    public void moveRectangleTo(int x,int y){
        objRec_Box.setLocation(x,y);
        repaint();
    }
}
