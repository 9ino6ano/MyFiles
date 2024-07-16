/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge.sort;

/**
 *
 * @author Pana
 * The sort method of this class sorts an array,
 * using the MERGE SORT ALGORITHM
 */
public class MergeSorter {
    /*
    SORTS AN ARRAY, USING THE MERGE SORT
    @PARAM = the array to be sorted
    */
    public static void sort(int[] objArray){
        if (objArray.length <= 1) {
            return;
        }
        int[] first = new int[objArray.length / 2];
        int[] second = new int[objArray.length - first.length];
        //copy the first half of objArray into the Second array
        for (int i = 0; i < first.length; i++) {
            first[i] = objArray[i];
        }
        for(int i = 0; i < second.length; i++){
            second[i] = objArray[first.length];
        }
        sort(first);
        sort(second);
        //merge the first and second array
        merge(first, second, objArray);        
    }
    /*
    Merges 2 sorted arrays into 1 array.
    @param = first - the first sorted array
    @param = second - the second sorted array
    @param = objArray - the array to which the 1st and 2nd Array
    are sorted into.
    */
    private static void merge(int[] first, int[] second,int[] objArray){
        int iFirst = 0;//The next element to consider in the first array
        int iSecond = 0;//The next element to be considered in the second array
        int j = 0;//The next open position on the objArray
        
        //As long as iFirst & iSecond havent passed the end of the Array
        //Then move the smaller element into the objArray
        while (iFirst < first.length && iSecond < second.length) {            
            if (first[iFirst]< second[iSecond]) {
                objArray[j] = first[iFirst];
                iFirst++;
            }
            else{
                objArray[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        /*
        Note that only one of the two loops below copies entries nto 
        1st we copy all entries retrieved from the first array
        
        */
        while (iFirst < first.length) {            
            objArray[j] = first[iFirst];
            iFirst++;
            j++;
        }
        //Copy any remaining entries of the second half
        while (iSecond < second.length) {            
            objArray[j] = second[iSecond];
            iSecond++;
            j++;
        }  
        
    }
    
    
}
