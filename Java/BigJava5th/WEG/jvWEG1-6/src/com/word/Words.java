/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.word;


/**
 *
 * @author Pana
 */
public class Words {
  private String Text;
    /**
     *Constructs a word by removing leading and trailing
     *non-letters characters, such as punctuation marks.
     *@param s the input string
     
     */
    public Words(String s){
        
        int i = 0;
        while (i < s.length() && !Character.isLetter(s.charAt(i))) {            
            i++;
        }
        int j = s.length() - 1;
        while (j < s.length() && !Character.isLetter(s.charAt(j))) {            
            j--;
        }
        //The practical off-by one error.
        //before the the str Hello , Reads Hell 
        //because i = 0 and j = 4
        Text = s.substring(i,j+1);
    }
    /**
     *Returns the text of the word, after the removal of the 
     * leading and trailing non-letter characters.
     *@return the text of the word.
     */
    public String getText(){
        return Text;
    }

    /**
     *Counts the syllables in the word.
     *@return the syllable count
     */
    
    public int countSyllables(){
        int count = 0;
        int end = Text.length() - 1;
        if (end < 0) {
            return 0;//The empty string has no syllables
        }
        //An e at the end of the word doesn't count as a vowel
        char ch = Text.charAt(end);
        if (ch == 'e' || ch == 'E') {
            end--;
        }
        boolean insideVowelGroup = false;
        for (int i = 0; i <= end; i++) {
            ch = Text.charAt(i);
            String vowels = "aeiouyAEIOUY";
            if (vowels.indexOf(ch)>= 0) {
                //ch is a vowel 
                if (!insideVowelGroup) {
                    //Start of new vowel group
                    count++;
                    insideVowelGroup = true;
                }
            }
            else{
                //because we were only testing  one condition , the variable insideVowelGroup was still true.
                //This causes a logical error, to fix this we need a way to set the variable false.
                insideVowelGroup = false;
            }
        }
        //Every word has at least one syllable
        if (count == 0) {
            count = 1;
        }
        return count;
    }
    
}
