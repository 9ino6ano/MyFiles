/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Pana
 * This sort method of this class = sorts an array, 
 * using the selection sort algorithm
 * 
 */
public class SelectionSorter {
    /*
    Sorts an array using the #SELECTION-SORT
    @param a - the array that should be sorted
    */
    public static void sort(int[] objArray){
        for (int i = 0; i < objArray.length; i++) {
            int minPos = minimumPosition(objArray, i);
            ArrayUtil.swap(objArray,minPos,i);
        }
    }
    /*
    Finds the smallest element in a tail range of an array
    @param a = the array to sort
    @param from = the first position in a to compare
    @return = the position of the smallest element in the range a[from]...a[length -1]
    */
    private static int minimumPosition(int[] objAr, int from){
        int minPos = from;
        for (int i = from + 1; i < objAr.length; i++) {
            if (objAr[i] < objAr[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }
}
