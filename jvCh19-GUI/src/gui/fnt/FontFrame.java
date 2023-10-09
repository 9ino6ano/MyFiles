/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.fnt;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
/**
 *This is a frame containing a text sample and a control panel
 * to change the font of the text.
 * @author Pana
 */
public class FontFrame extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private JLabel label;
    private JCheckBox italicCheckBox;
    private JCheckBox boldCheckBox;
    private JRadioButton smallButton;
    private JRadioButton mediumButton;
    private JRadioButton largeButton;
    private JComboBox faceNameCombo;
    private ActionListener listener;
    
    //constructs a frame
    public FontFrame(){
        //construct text sample
        label = new JLabel("Big Java");
        add(label,BorderLayout.CENTER);
        
        //this listener is shared among all components
        listener = new ChoiceListener();
        
        createControlPanel();
        setLabelFont();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }
    class ChoiceListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            setLabelFont();
        }
    }
    public void createControlPanel(){
    //creates a control panel where the font will be changed
        JPanel faceNamePanel = createComboBox();
        JPanel sizeGroupPanel = createCheckBox();
        JPanel styleGroupPanel = createRadioButtons();
        
        //line up component panels
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 1));
        controlPanel.add(faceNamePanel);
        controlPanel.add(sizeGroupPanel);
        controlPanel.add(styleGroupPanel);
        //Add panels to the content pane
        add(controlPanel, BorderLayout.SOUTH);
    }
    /*
    Creates the combo box with the font style choices
   @return the panel containing the combo box
    */
    public JPanel createComboBox(){
        faceNameCombo = new JComboBox();
        faceNameCombo.addItem("Serif");
        faceNameCombo.addItem("SansSerif");
        faceNameCombo.addItem("Monospaced");
        faceNameCombo.setEditable(true);
        faceNameCombo.addActionListener(listener);
        
        JPanel panel = new JPanel();
        panel.add(faceNameCombo);
        return panel;
    }
    /**
     *Creates the check boxes for selecting a bold,italic style.
     * @return the panel containing the check boxes.
     */
    public JPanel createCheckBox(){
    
        italicCheckBox = new JCheckBox("Italic");
        italicCheckBox.addActionListener(listener);
        boldCheckBox = new JCheckBox("Bold");
        boldCheckBox.addActionListener(listener);
        
        JPanel panel = new JPanel();
        panel.add(italicCheckBox);
        panel.add(boldCheckBox);
        panel.setBorder(new TitledBorder(new EtchedBorder(),"Style"));
        
        return panel;
        
    }
    /**
     * Creates the radio buttons to select the font size.
     * 
     * @return the panel containing the radio buttons
     */
    
    public JPanel createRadioButtons(){
    
        smallButton = new JRadioButton("Small");
        smallButton.addActionListener(listener);
        mediumButton = new JRadioButton("Medium");
        mediumButton.addActionListener(listener);
        largeButton = new JRadioButton("Large");
        largeButton.addActionListener(listener);
        largeButton.setSelected(true);
        
        //Add the radio buttons to a button group
        ButtonGroup group = new ButtonGroup();
        group.add(smallButton);
        group.add(mediumButton);
        group.add(largeButton);
        
        JPanel panel = new JPanel();
        panel.add(smallButton);
        panel.add(mediumButton);
        panel.add(largeButton);
        panel.setBorder(new TitledBorder(new EtchedBorder(),"Size"));
        return panel;
        
    }
    /**
     *Gets user choice for font name, style and size
     * and sets the font of the sample text
     */
    public void setLabelFont(){
    
        //gets font name
        String faceName = (String) faceNameCombo.getSelectedItem();
        //gets the font style
        int style = 0;
        if (italicCheckBox.isSelected()) {
            style = style + Font.ITALIC;
        }
        if (boldCheckBox.isSelected()) {
         
            style = style + Font.BOLD;
        }
        //Get font size
        int size = 0;
        
        final int SMALL_SIZE = 24;
        final int MEDIUM_SIZE = 36;
        final int LARGE_SIZE = 48;
        
        if (smallButton.isSelected()) {
            size = SMALL_SIZE;
        }else if (mediumButton.isSelected()) {
            size = MEDIUM_SIZE;
        }else if (largeButton.isSelected()) {
            size = LARGE_SIZE;
        }
        //Set font of text field
        label.setFont(new Font(faceName, style, size));
        label.repaint();
        
        
    }
    
    
    
}
