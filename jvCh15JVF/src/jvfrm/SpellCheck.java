/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvfrm;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *The following program shows a practical application of sets.
 * it reads in all words from a dictionary file that contains correctly spelled words and places
 * them in a set.
 * @author Pana
 * 
 * This program checks which words in a file are not present in a dictionary.
 */
public class SpellCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        //Read the dictionary and the document
        Set<String> dictionaryWords = readWords("words");
        Set<String> documentWords = readWords("alice30.txt");
        // print all words that are in the document but not the dictionary
        for (String word : documentWords) {
            if (!dictionaryWords.contains(word)) {
                System.out.println(word);
            }
        }
    }
    /**
     * Reads all words from a file.
     * @param = filename - the name of the file
     * @return = set - a set of lowercased words in the file.
     * Here is a word in a sequence of upper and lowercase letters.
     */
    public static Set<String> readWords(String fileName) throws FileNotFoundException{
        Set<String> words = new HashSet<String>();
        Scanner in = new Scanner(new File(fileName));
        //Use any characters other than a-z / A - Z as delimeters
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext()) {            
            words.add(in.next().toLowerCase());
        }
        return words;
    }
}
