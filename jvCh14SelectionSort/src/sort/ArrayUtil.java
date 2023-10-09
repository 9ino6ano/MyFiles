/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;
import java.util.Random;
/**
 *
 * @author Pana
 * This class contains utility methods for array manipulation
 */
public class ArrayUtil {
    private static Random gen = new Random();
    /*
    Creates an array filled with random values
    @param length = the size/length of the array
    @param n = the number of possible random values
    @return a = an array filled with random values from 0 .. length - 1
    */
    public static int[] randomArray(int length, int n){
        int[] objA = new int[length];
        for (int i = 0; i < objA.length; i++) {
            objA[i] = gen.nextInt(n);
        }
        return objA;
    }
    public static void swap(int[] objA, int i, int j){
        int temp = objA[i];
        objA[i] = objA[j];
        objA[j] = temp;
    }
    
    
    
    
}
