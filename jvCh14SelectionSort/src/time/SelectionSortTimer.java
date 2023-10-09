/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;
import java.util.Scanner;
import sort.ArrayUtil;
import sort.SelectionSorter;
/**
 *
 * @author Pana
 * This program measures how long it takes to sort an 
 * array of a user-specified size with the selection soert algorithm
 
 */
public class SelectionSortTimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Array Size: ");;
        int n = sc.nextInt();
        
        //construct random array
        int[] objA = ArrayUtil.randomArray(n, 100);
        //Use a stop watch to time the selection sort
        Stopwatch objTime = new Stopwatch();
        objTime.start();
        SelectionSorter.sort(objA);
        objTime.stop();
        System.out.println("Elapsed Time: "+objTime.getElapsedTime()+" milliseconds");
        
    }
    
}
