/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.fnt.menu;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *This frame has a menu with commands to change the font of a text sample
 * @author Pana
 */
public class FontFrame extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private JLabel label;
    private String faceName;
    private int fontStyle;
    private int fontSize;
    
    //constructs a frmae
    public FontFrame(){
        //constructs a text sample
        label = new JLabel("Big Java");
        add(label, BorderLayout.CENTER);
        
        //construct menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(createFileMenu());
        menuBar.add(createFontMenu());
        
        faceName = "Serif";
        fontSize = 24;
        fontStyle = Font.PLAIN;
        
        setLabelFont();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
       
        
    }
    class ExitItemListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.exit(0);
        }
    }
    /**
     * Creates the file menu
     * @return the menu 
     */
    public JMenu createFileMenu(){
        JMenu menu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        ActionListener listener = new ExitItemListener();
        exitItem.addActionListener(listener);
        menu.add(exitItem);
        return menu;
    }
    /**
     * Creates the font of a sub menu
     * @return a sub menu
     */
    public JMenu createFontMenu(){
    
        JMenu menu = new JMenu("Font");
        menu.add(createFaceMenu());
        menu.add(createSizeMenu());
        menu.add(createStyleMenu());
        return menu;
    }
    /**
     * Creates the face sub menu
     * @return = menu
     */
    public JMenu createFaceMenu(){
    
        JMenu menu = new JMenu("Face");
        menu.add(createFaceItem("Serif"));
        menu.add(createFaceItem("SansSerif"));
        menu.add(createFaceItem("Monospaced"));
        return menu;
    }
    /**
     * Creates the Size Sub Menu
     * 
     * @return = sub menu 
     */
    public JMenu createSizeMenu(){
    
        JMenu menu = new JMenu("Size");
        menu.add(createSizeItem("Smaller", -1));
        menu.add(createSizeItem("Larger", 1));
        return menu;
    }
    /**
     * creates the style sub menu
     * @return the menu
     */
    public JMenu createStyleMenu(){
    
        JMenu menu = new JMenu("Style");
        menu.add(createStyleItem("Plain", Font.PLAIN));
        menu.add(createStyleItem("Bold", Font.BOLD));
        menu.add(createStyleItem("Italic", Font.ITALIC));
        menu.add(createStyleItem("Bold Italic", Font.BOLD + Font.ITALIC));
        return menu;
        
    }
    public JMenuItem createFaceItem(final String name){
    
        class FaceItemListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                faceName = name;
                setLabelFont();
            }
        }
        JMenuItem item = new JMenuItem(name);
        ActionListener listener = new FaceItemListener();
        return item;
    }
    public JMenuItem createSizeItem(String name, final int increment){
        class SizeItemListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                fontSize = fontSize + increment;
                setLabelFont();
            }
        }
        JMenuItem item = new JMenuItem(name);
        ActionListener listener = new SizeItemListener();
        item.addActionListener(listener);
        return item;
    }
    /**
     * creates a menu item to change the font style
     * and set its action listener
     *@param = name the name of the menu item
     *@param = style the new font style
     *@return = menu item
     */
    public JMenuItem createStyleItem(String name, final int style){
        class StyleItemListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                fontStyle = style;
                setLabelFont();
            }
        }
        JMenuItem item = new JMenuItem(name);
        ActionListener listener = new StyleItemListener();
        item.addActionListener(listener);
        return item;
        
    }
    public void setLabelFont(){
        Font f = new Font(faceName, fontStyle, fontSize);
        label.setFont(f);
    }
    
}
