/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.word;
import java.util.Scanner;
/**
 *This class describes words in a document.
 *There are a couple of bugs in this class.
 * 
 *
 * @author Pana
 */
public class SyllableCounter {

    /**
     *This program counts the syllables of all words in a sentence.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence ending in a period. ");
        String input;
        do {
            input = in.next();
            Words w = new Words(input);
            int syllables = w.countSyllables();
            System.out.println("Syllables in "+input+": "+syllables);
        } while (!input.endsWith("."));
        //This program was used to inspect bugs in a program
    }
    
}
