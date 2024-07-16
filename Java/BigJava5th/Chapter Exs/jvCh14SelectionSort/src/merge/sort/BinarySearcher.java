/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge.sort;

/**
 *A class for executing binary searches in an array
 * @author Pana
 * finds a value in a range of a sorted array, using the binary search algorithm
 *@param objArray = the array to which we going to search
 *@param Low = the index of the lowest number in a array/range
 *@param High = the index of the highest number in a array/range
 *@param Value = the search value to find
 *@return Pos = return the index @ which the the search value is found at.
 *@return -1 = if the search value is not found in the array
* 
 */
public class BinarySearcher {
    public static int search(int[] arrayObj, int low, int high, int value){
    
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arrayObj[mid] == value) {
                return mid;
            }
            else if (arrayObj[mid] < value) {
                return search(arrayObj, mid + 1, high, value);
            }
            else{
                return search(arrayObj, low, mid - 1, value);
            }
        }
        else
        {
            return -1;
        }
    }
}
