/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax;

import java.util.Scanner;

/**
 *
 * @author Pana
 */
public class TaxCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Your Income:  R");
        double Aincome = in.nextDouble();
        System.out.println("Are You Married Or Single? (Y/N): ");
        String Astats = in.next();
        int Status = 0;
        int count = 0;
        TaxReturn objTax;
         
            
            if (Astats.equals("Y")) 
            {
                Status = TaxReturn.MARRIED;
            }
            else if(Astats.equalsIgnoreCase("N"))
            {
                Status = TaxReturn.SINGLE;
            }
            else{
                System.out.println("Incorrect Information Acquired.");
            }
            objTax = new TaxReturn(Aincome, Status);
            System.out.println("Tax: " + objTax.getTax());
            count++;
         
          
         
        
        
        
    }
    
}
