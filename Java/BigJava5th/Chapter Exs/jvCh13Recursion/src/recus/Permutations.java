/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recus;

import java.util.ArrayList;

/**
 *
 * @author Pana
 * This class computes permutation in a string
 * 
 * Permutations are easily accessible through a recursion loop
 * 
 * Permutation = rearrangement of letters in a string e.g
 * eat has 6 permutations [eat,eta,tea,tae,ate,aet]
 */
public class Permutations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (String s : permutations("eat")) {
            System.out.println(s);
        }
        
        
    }
    /*
    Gets all the permutation of a given word.
    @param = word; the string to permute
    @return = a list of all permutations
    */
    public static ArrayList<String> permutations(String word){
        ArrayList<String> result = new ArrayList<String>();
        //The empty string has a single permutation: itself
        if (word.length()==0) {
            result.add(word);
            return result;
        }
        else{
            //Loop through all character positions
            for (int i = 0; i < word.length(); i++) {
                //Form a shorter word by removing the ith character
                String shorter = word.substring(0, i) + word.substring(i + 1);
                // Generate all permutations of the simpler word
                ArrayList<String> shortPermutations = permutations(shorter);
                //Adds the removed charater to the front of each permutation of the simpler word
                for (String s : shortPermutations) {
                    result.add(word.charAt(i)+ s);
                }
                
            }
            //Return all permutations
            return result;
        }
    
    
    }   
    
}
