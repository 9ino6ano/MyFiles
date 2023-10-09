/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *A component that lets a user enter a number, using a button pad with digits
 * @author Pana
 */
public class Keypad extends JPanel{
    private JPanel buttonPanel;
    private JButton clearButton;
    private JTextField display;

    /**
     *Constructs the keypad panel
    */

    public Keypad(){
        setLayout(new BorderLayout());
        //Add Display field
        display = new JTextField();
        add(display,"North");
        //Make a button 
        buttonPanel =new JPanel();
        buttonPanel.setLayout(new GridLayout(3,4));
        //Add digit buttons
        addButton("7");
        addButton("8");
        addButton("9");
        addButton("4");
        addButton("5");
        addButton("6");
        addButton("1");
        addButton("2");
        addButton("3");
        addButton("0");
        addButton(".");
        //Add clear entry button
        clearButton = new JButton("CE");
        buttonPanel.add(clearButton);
        
        class ClearButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                display.setText("");
            }
        }
        ActionListener iistener = new ClearButtonListener();
        clearButton.addActionListener(new ClearButtonListener());
        add(buttonPanel, "Center");
        
    }
    /**
     *Adds a button to the button panel.
     * @param label the button label
     */
    private void addButton(final String label){
        class DigitButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                //dont add two decimal points\
                if (label.equals(".") && display.getText().indexOf(".") != -1) {
                    return;
                }
                //append the label to the text button
                display.setText(display.getText() + label);
            }
        }
        
        JButton button = new JButton(label);
        buttonPanel.add(button);
        ActionListener listener = new DigitButtonListener();
        button.addActionListener(listener);
                
                
                
    }
    /**
     *clears the display
     */
    public void clear(){
        display.setText("");
    }
    /**
     *Gets the value that the user has entered.
     * @return value in the text field of the keypad
     */

    public double getValue() {
       return Double.parseDouble(display.getText());
    }
    





}




