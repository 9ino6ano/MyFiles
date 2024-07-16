/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec.comp.mc;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
/**
 *
 * @author Pana
 * this frame contains a moving triangle
 */
public class RectangleFrame extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private RectangleComponent objScene;
    
    class MousePressedListener implements MouseListener{
        public void mousePressed(MouseEvent event){
        
            int x = event.getX();
            int y = event.getY();
            objScene.moveRectangleTo(x, y);
           
        }
        //These are do-nothing methods
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
        
    }
    public RectangleFrame(){
        objScene = new RectangleComponent();
        add(objScene);
        
        MouseListener objList = new MousePressedListener();
        objScene.addMouseListener(objList);
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }
}
