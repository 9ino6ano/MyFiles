/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge.sort;
import java.util.Arrays;
import java.util.Scanner;
import sort.ArrayUtil;
import sort.SelectionSorter;
/**
 *
 * @author Pana
 * The program demonstrates the linear search algorithm.
 */
public class LinearSearchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aObj = ArrayUtil.randomArray(20, 100);
        System.out.println(Arrays.toString(aObj));
        Scanner in = new Scanner(System.in);
        
        boolean done = false;
        while (!done) {            
            System.out.println("Enter a number to search for ?? -1 to quit: ");
            int n = in.nextInt();
            if (n == -1) {
                done = true;
            }
            else{
                int pos = LinearSearcher.search(aObj, n);
                System.out.println("We Found "+n+" @ position "+pos);
            }
        }
        
        
    }
    
}
