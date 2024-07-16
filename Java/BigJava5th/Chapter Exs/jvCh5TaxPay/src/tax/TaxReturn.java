/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax;

import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;
import javax.swing.JOptionPane;

/**
 *
 * @author Pana
 * a tax return of a tax payer in 2022
 */
public class TaxReturn {
    //declare constants
    public static final int SINGLE = 1;
    public static final int MARRIED = 2;
    //constants for nest access
    public static final double RATE_1 = 0.10;
    public static final double RATE_2 = 0.25;
    public static final double RATE_SINGLE_LIMIT = 32000;
    public static final double RATE_MARRIED_LIMIT = 64000;
    
    //declare instance variables
    private double Income;
    private int Status;

    //parameterized constructor
    public TaxReturn(double aIncome, int aStats){
    
        Income = aIncome;
        Status = aStats;
    }
    //provide method to return tax 
    public double getTax(){
        //DECLARE LOCAL VARIABLE ONLY TO BE USED HERE
        double tax1 = 0;
        double tax2 = 0;
    
        //COMPUTE THE TAX BASE ON THE MARITAL STATS CONDITIONS
        if (Status == SINGLE) {
            //first we test to see if the status is M/F
            if(Income <= RATE_SINGLE_LIMIT){
                //Second we test to see if income has exceeded tax return amount
                tax1 = RATE_1 * Income;
            }
            else
            {
                tax1 = RATE_1 * RATE_SINGLE_LIMIT;
                tax2 = RATE_2 * (Income - RATE_SINGLE_LIMIT);
            }
        }// this if tests the single condition
        else if(Status == MARRIED)
        {// this else of the 1st if test the married condiion
            if (Income <= RATE_MARRIED_LIMIT) {
                tax1 = RATE_1 * Income;
            }
            else
            {
                tax1 = RATE_1 * RATE_MARRIED_LIMIT;
                tax2 = RATE_2 * (Income - RATE_MARRIED_LIMIT);
            }
        
        }
        else{// handle errors and incorrect data or empty strings
                JOptionPane.showMessageDialog(null, "Please specify a Status.\n Are You Married? Or Single?");
                System.out.println("Please specify your Marital Status: \nSingle.\tOR\tMarried.");
        }
        
        return tax1 + tax2;
    
    }
    
    
    
    
    
}
