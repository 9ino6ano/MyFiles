/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Pana
 */
public class Calculator implements ActionListener{

    JFrame jf;
    JTextField jtxt;
    JButton[] number_buttons = new JButton[10];
    JButton[] function_buttons = new JButton[12];
    JButton add_Button,sub_Button,multi_Button,div_Button,neg_Button;
    JButton esc_Button,equal_Button,del_Button,clear_Button;
    JPanel jp;
    //Improve this app by including the scientific aspects
    JButton sq_root,exponent,factorise,simplifi;
    
    Font myFont = new Font("Ink Free",Font.BOLD,25);
    double num_1=0,num_2=0,result=0;
    char arithmatic_operator;
    
    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(430,500);
        jf.setLayout(null);
        jtxt = new JTextField();
        jtxt.setBounds(50,25,300,30);
        jtxt.setFont(myFont);
        jtxt.setEditable(false);
        
        add_Button = new JButton("+");
        sub_Button = new JButton("-");
        multi_Button = new JButton("*");
        div_Button = new JButton("/");
        esc_Button = new JButton(".");
        equal_Button = new JButton("=");
        del_Button = new JButton("D");
        clear_Button = new JButton("CE");
        neg_Button = new JButton("-x");
        //scientific buttons
        sq_root = new JButton("sq");
        exponent = new JButton("ex");
        factorise = new JButton("f");
        simplifi = new JButton("s");
        function_buttons[0] = add_Button;
        function_buttons[1] = sub_Button;
        function_buttons[2] = multi_Button;
        function_buttons[3] = div_Button;
        function_buttons[4] = esc_Button;
        function_buttons[5] = del_Button;
        function_buttons[6] = clear_Button;
        function_buttons[7] = equal_Button;
        function_buttons[8] = neg_Button;
        
        function_buttons[9] = sq_root;
        function_buttons[10] = exponent;
        function_buttons[11] = factorise;
        //function_buttons[12] = simplifi;
        
       
        for (int i = 0; i < 12; i++) {
            function_buttons[i].addActionListener(this);
            function_buttons[i].setFont(myFont);
            function_buttons[i].setFocusable(false);
        }
        
        for (int i = 0; i < 10; i++) {
            number_buttons[i]=new JButton(String.valueOf(i));
            number_buttons[i].addActionListener(this);
            number_buttons[i].setFont(myFont);
            number_buttons[i].setFocusable(false);
        }
        //set the bounds for the scientific operations
        sq_root.setBounds(300,430,100,50);
        exponent.setBounds(350,430,100,50);
        simplifi.setBounds(400,430,100,50);
        factorise.setBounds(450,430,100,50);
        neg_Button.setBounds(50,430,100,50);
        del_Button.setBounds(150,430,100,50);
        clear_Button.setBounds(250,430,100,50);
        
        
        jp = new JPanel();
        jp.setBounds(50,100,300,300);
        jp.setLayout(new GridLayout(4,4,10,10));
        jp.setBackground(Color.LIGHT_GRAY);
        
        jp.add(number_buttons[1]);
        jp.add(number_buttons[2]);
        jp.add(number_buttons[3]);
        jp.add(add_Button);
        jp.add(number_buttons[4]);
        jp.add(number_buttons[5]);
        jp.add(number_buttons[6]);
        jp.add(sub_Button);
        jp.add(number_buttons[7]);
        jp.add(number_buttons[8]);
        jp.add(number_buttons[9]);
        jp.add(multi_Button);
        jp.add(esc_Button);
        jp.add(number_buttons[0]);
        jp.add(equal_Button);
        jp.add(div_Button);
        
        jf.add(jp);
        jf.add(neg_Button);
        jf.add(del_Button);
        jf.add(clear_Button);
        //add the buttons to the panel
        
        jf.add(jtxt);
        jf.setVisible(true);
    }
    public static void main(String[] args){
        Calculator objCalc = new Calculator();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < 10; i++) {
            if (ae.getSource() == number_buttons[i]) {
                jtxt.setText(jtxt.getText().concat(String.valueOf(i)));
            }
        }
        if (ae.getSource() == esc_Button) {
            jtxt.setText(jtxt.getText().concat("."));
        }
        if (ae.getSource() == add_Button) {
            num_1 = Double.parseDouble(jtxt.getText());
            arithmatic_operator = '+';
            jtxt.setText("");
        }
        if (ae.getSource() == sub_Button) {
            num_1 = Double.parseDouble(jtxt.getText());
            arithmatic_operator = '-';
            jtxt.setText("");
        }
        if (ae.getSource() == multi_Button) {
            num_1 = Double.parseDouble(jtxt.getText());
            arithmatic_operator = '*';
            jtxt.setText("");
        }
        if (ae.getSource() == div_Button) {
            num_1 = Double.parseDouble(jtxt.getText());
            arithmatic_operator = '/';
            jtxt.setText("");
        }
        if (ae.getSource() == equal_Button) {
            num_2 = Double.parseDouble(jtxt.getText());
            
            switch(arithmatic_operator){
                case '+': result = num_1 + num_2;
                    break;
                case '-': result = num_1 - num_2;
                    break;
                case '*': result = num_1 * num_2;
                    break;
                case '/': result = num_1 / num_2;
            }
            
            jtxt.setText(String.valueOf(result));
            num_1 = result;
        }
        if (ae.getSource() == clear_Button) {
            jtxt.setText("");
        }
         if (ae.getSource() == del_Button) {
            String str = jtxt.getText();
            jtxt.setText("");
             for (int i = 0; i < str.length() -1; i++) {
                 jtxt.setText(jtxt.getText() + str.charAt(i));
             }
        }
        if (ae.getSource() == neg_Button) {
            double temp = Double.parseDouble(jtxt.getText());
            temp *= -1;
            jtxt.setText(String.valueOf(temp));
        }
    }
    
}
