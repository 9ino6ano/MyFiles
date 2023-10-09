/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.fnt.colr;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
/**
 *
 * @author Pana
 */
public class ColorFrame extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private JPanel colorPanel;
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;
    
    public ColorFrame(){
    
        colorPanel = new JPanel();
        add(colorPanel, BorderLayout.CENTER);
        createControlPanel();
        setSampleColor();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        
    }
    class ColorListener implements ChangeListener{
        public void stateChanged(ChangeEvent event){
            setSampleColor();
        }
    }
    public void createControlPanel(){
        ChangeListener listener = new ColorListener();
        
        redSlider = new JSlider(0,255,255);
        redSlider.addChangeListener(listener);
        
        greenSlider = new JSlider(0, 255, 175);
        greenSlider.addChangeListener(listener);
        
        blueSlider = new JSlider(0, 255, 175);
        blueSlider.addChangeListener(listener);
        
        JPanel controlJPanel = new JPanel();
        controlJPanel.setLayout(new GridLayout(3,2));
        controlJPanel.add(new JLabel("Red"));
        controlJPanel.add(redSlider);
        controlJPanel.add(new JLabel("Green"));
        controlJPanel.add(greenSlider);
        controlJPanel.add(new JLabel("Blue"));
        controlJPanel.add(blueSlider);
        
        add(controlJPanel, BorderLayout.SOUTH);
        
    }
    public void setSampleColor(){
        //Read slider values
        int red = redSlider.getValue();
        int green = greenSlider.getValue();
        int blue = blueSlider.getValue();
        
        //Set panel background to selected color
        colorPanel.setBackground(new Color(red,green,blue));
        colorPanel.repaint();
        
        
    }
}
