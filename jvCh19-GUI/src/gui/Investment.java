/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *A frame that show growth of an investment with variable interest.
 * @author Pana
 */
public class Investment extends JFrame {
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 100;
    
    private static final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;
    
    private JLabel rateLabel;
    private JTextField rateField;
    private JButton button;
    private JLabel resultLabel;
    private double balance;
    
    public Investment(){
        balance = INITIAL_BALANCE;
        resultLabel = new JLabel("Balance: "+ balance);
        //CREATE THE FORM OBJECTS
        createTextField();
        createButton();
        createPanel();
        
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }
    public void createTextField(){
        rateLabel = new JLabel("Interest Rate: ");
        
        final int FIELD_WIDTH = 10;
        rateField = new JTextField(FIELD_WIDTH);
        rateField.setText(""+DEFAULT_RATE);
        
    }
    /*
    Adds interest to the balance and updates the display
    */
    class AddInterestListener implements ActionListener{
    
        public void actionPerformed(ActionEvent event){
            double rate = Double.parseDouble(rateField.getText());
            double interest = balance * rate / 100;
            balance = balance + interest;
            resultLabel.setText("Balance: "+ balance);
        }
    }
    private void createButton(){
        button = new JButton("Add Interest");
        
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
        
    }
    private void createPanel(){
    
        JPanel panel = new JPanel();
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(button);
        panel.add(resultLabel);
        add(panel);
    }
    
}
