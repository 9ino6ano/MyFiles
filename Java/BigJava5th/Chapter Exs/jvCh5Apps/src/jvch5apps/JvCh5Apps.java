/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvch5apps;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pana
 */
public class JvCh5Apps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //this program simulates an elevator panel
        Scanner input = new Scanner(System.in);
        System.out.print("Floor: ");
        int valFloor = input.nextInt();
        //adjust floor wherever appiicable
        int actualFloor;
        if (valFloor > 13) {
            actualFloor = valFloor - 1;
        }
        else
        {
            actualFloor = valFloor;
        }
        System.out.println("The Elevator will travel actually move to: " + actualFloor);
        //basic if and else if statement
        String inQuake = JOptionPane.showInputDialog("Please enter the Richter Scale Measurement: ");
        int measure = Integer.parseInt(inQuake);
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("The projected measurement is: "+measure);
        // beginning of multiple if statements
        if (measure >= 8.0) {
            System.out.println("EARTHQUAKE,EARTHQUAKE!!!\n Structures Have Fallen.");
        }
        else if(measure >= 7.0){
            System.out.println("Many building approximatly have been destroyed!!!");
        }
        else if(measure >= 6.0){
            System.out.println("Many buildings considerably damaged, some have collapsed.");
        }
        else if(measure >= 4.5){
            System.out.println("Damage to Poorly Constructed buildings.");
        }
        else
        {
            System.out.println("No Destruction of Buildings.");
        }
         //loop
        int count = 0;
        
        do {
        String inQuake2 = JOptionPane.showInputDialog("Please specify the following Richter Measure: ");
        int measure2 = Integer.parseInt(inQuake2);
        System.out.println("Measure "+count+" is: "+ measure2);
        //specify basic conditions
            if (measure2 > 8.0) {
            JOptionPane.showMessageDialog(null,"Rc_Scale: "+measure2+" .\nMost structure have fallen...\n");
            }
            else if (measure > 6.0) {
            JOptionPane.showMessageDialog(null,"Rc_Scale: "+measure2+" .\nSome structure have fallen and considerably damaged......\n");    
            }
            else if (measure2 > 3.5){
            JOptionPane.showMessageDialog(null, "Rc_Scale: "+measure2+" .\nDamage to poorly constructed building....\n");
            }
            else {
            JOptionPane.showMessageDialog(null, "RcScale: "+measure2+" .\nEither No Structure has falllen...\nif value is [< 0 or >12] The Value entered is inccorrect");
            }
           count++;
        } while (count < 5);
        System.out.print("The Number Of Scales Depicted: " + count +"\n");
        //The Switch statement
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
        int digit = 0;
        String DigitName = null;
        //prompt for the digit
        System.out.print("Please enter the digit:  ");
        
        digit = input.nextInt();
        switch (digit){
       
            case 1: DigitName = "One";
                break;
            case 2: DigitName = "Two";
                break;
            case 3: DigitName = "Three";
                break;
            case 4: DigitName = "Fola fo";
                break;
            case 5: DigitName = "Fifo la";
                break;
            case 6: DigitName = "SeSe";
                break;
            case 7: DigitName = "Up_Seven";
                break;
            case 8: DigitName = "Agt_vir_Agt";
                break;
            case 9: DigitName = "NinoNano";
                break;
            case 10:DigitName = "The Value "+digit+" is more than current generation\nThis begins a new Number Generation.";
            default: DigitName = "Please specify a Digit to Convert: \nBetween  [1 - 9]";
                break;   
        }
        System.out.println("The Digit is: "+ digit+"\n"+"The Name Associated with it is: "+DigitName);
    }
    
}
