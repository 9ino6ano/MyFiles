/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge.sort;

/**
 *
 * @author Pana
 * A class for executing a linear search in an array
 */
public class LinearSearcher {
    /*
    Finds a value in an array, using the linear search algorithm
    @param = a - the array to search
    @param = value - the value to find
    @return = the index at which the value appears/occurs
    or -1 if it does not occur in the array
    */
    public static int search(int[] objAr, int value){
        for (int i = 0; i < objAr.length; i++) {
            if (objAr[i]== value) {
                return i;
            }
        }
        return -1;
    }
    
    
}
