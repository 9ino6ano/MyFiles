/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge.sort;
import java.util.Arrays;
import sort.ArrayUtil;
import sort.SelectionSorter;
/**
 *
 * @author Pana
 * This program demonstrates the mere sort algorithm 
 * by sorting an array that is filled with random numbers.
 */
public class MergeSortDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] objAr = ArrayUtil.randomArray(20, 100);
        System.out.println("The Un-Merged Array");
        System.out.println(Arrays.toString(objAr));
        MergeSorter.sort(objAr);
        System.out.println("The Merged Array");
        System.out.println(Arrays.toString(objAr));
    }
    
}
