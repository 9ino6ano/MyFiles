/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.tex;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Pana
 */
public class PopulationDensity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //open input files
        Scanner sc1 = new Scanner(new File("worldpop.txt"));
        Scanner sc2 = new Scanner(new File("worldarea.txt"));
        
        //open an output file
        PrintWriter out = new PrintWriter("world_pop_density.txt");
        
        //reads lines from each file
        while (sc1.hasNextLine()&&sc2.hasNextLine()) {            
            CountryValue population = new CountryValue(sc1.nextLine());
            CountryValue area = new CountryValue(sc2.nextLine());
        
            //coumpute and print the population density
            double density = 0;
            if (area.getValue() != 0) {;//protect against division by zero
                density = population.getValue() / area.getValue();
            }
            out.printf("%-40s%15.2f\n",population.getCountry(),density);
        }
        sc1.close();
        sc2.close();
        out.close();
        
    }
    
}
