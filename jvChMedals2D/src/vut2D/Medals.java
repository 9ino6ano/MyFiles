/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut2D;

/**
 *
 * @author Pana
 * This program prints the table of a medal winner
 * and counts them all in a table of row/columns
 */
public class Medals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int COUNTRIES = 7;
        final int MEDALS = 3;
        String[] countries = 
        {
            "Zimbabwe",
            "Botswana",
            "Namibia",
            "Mozambique",
            "Zambia",
            "Lesotho",
            "Swaziland"
        };
        int[][] counts = 
        {
            { 1, 0, 1 },
            { 1, 1, 0 },
            { 0, 0, 1 },
            { 1, 0, 0 },
            { 0, 1, 1 },
            { 0, 1, 1 },
            { 1, 1, 0 }
        };
        System.out.println("       Country        Gold    Silver  Bronze Total");
        //pints the countries , counts and row totals
        for (int i = 0; i < COUNTRIES; i++) {
            //proccesses the row
            System.out.printf("%15s",countries[i]);
            int total = 0;
            //print each row element and update the row total
            for (int j = 0; j < MEDALS; j++) {
                System.out.printf("%8d", counts[i][j]);
                total = total + counts[i][j];
            }
            System.out.printf("%8d\n",total);
        }
    }
    
}
