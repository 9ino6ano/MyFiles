/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg.Cash;

import java.util.Scanner;

/**
 *
 * @author Pana
 */
public class Volume extends CashRegTester{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //read the price per pack
        Scanner in = new Scanner(System.in);
        
        System.out.print(" Please enter the price for a 6-pack: ");
        double PackPrice = in.nextDouble();
        System.out.print(" Please enter the price for a 2L Bottle: ");
        double BottlePrice = in.nextDouble();
        
        //declare constants
        final double CANS_PER_PACK = 6;
        final double CANS_VOLUME = 0.355;
        final double BOTTLE_VOLUME = 2;
        
        //calculate and print the price per liter
        double pricePL = PackPrice / (CANS_PER_PACK * CANS_VOLUME);
        double bottLEpL = BottlePrice / BOTTLE_VOLUME;
        
        System.out.printf("The Pack Price for a litre:  %8.2f",pricePL);
        System.out.println();
        System.out.printf("The Bottle Price for a litre:  %8.2f",bottLEpL);
        System.out.println();
        
    }
    
}
