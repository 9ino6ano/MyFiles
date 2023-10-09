/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Arrays;

/**
 *
 * @author Pana
 * This program demonstrates the selection sort algorithm
 * by sorting an array that is filled with random numbers
 */
public class SelectionSortDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] objArray = ArrayUtil.randomArray(20, 100);
        System.out.println("The Unsorted Random No.Value Array: ");
        System.out.println(Arrays.toString(objArray));
        SelectionSorter.sort(objArray);
        System.out.println("The Sorted Array: ");
        System.out.println(Arrays.toString(objArray));
        
    }
    
}
