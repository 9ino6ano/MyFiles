/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec.comp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
/**
 *
 * @author Pana
 * the frame contains a moving triangle
 */
public class RectangleFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private RectangleComponent scene;
    
    class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            scene.moveRectangleBy(1, 1);
        }
    }
    public RectangleFrame(){
        scene = new RectangleComponent();
        add(scene);
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        
        ActionListener objList = new TimerListener();
        
        final int DELAY = 100;//Milliseconds between timer ticks
        Timer t = new Timer(DELAY,objList);
        t.start();
    }
}
