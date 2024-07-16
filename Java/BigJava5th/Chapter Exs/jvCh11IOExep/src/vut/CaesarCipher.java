/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author Pana
 * This program encrypts a file using the Julio Caesar CIPHER
 */
public class CaesarCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
    
        final int DEFAULT_KEY = 3;
        int key = DEFAULT_KEY;
        String inFile = "";
        String outFile = "";
        //THE NO. OF COMMAND-LINE ARGUMENTS THAT ARE FILES
        int files = 0;
        
        for (int i = 0; i < args.length; i++) {
            String argu = args[i];
            if (argu.charAt(0) == '-') {
                //it is a command line option
                char option = argu.charAt(1);
                if (option == 'd') {
                    key = -key;
                }else{
                    usage();
                    return;
                }
                
            }else{
                //it is a file name
                files++;
                if (files == 1) {
                    inFile = argu;
                }
                else if (files == 2) {
                    outFile = argu;
                }
            
            }
            if (files != 2) {
               usage();
               return;
            }
        }
        
        Scanner inSC = new Scanner(new File(inFile));
        inSC.useDelimiter("");//this processes individual characters
        PrintWriter out = new PrintWriter(outFile);
        while (inSC.hasNext()) {            
            char from = inSC.next().charAt(0);
            char to = encrypt(from,key);
            out.print(to);
        }
        inSC.close();
        out.close();    
    }
    /*
    Encrypts upper-lowercase characters by shifting them according to a key
    @param ch - the letter to be encrypterd
    @param key - the encryption key
    @return - the encrypted letter
    */
    public static char encrypt(char aCH, int aKEY){
        int base = 0;
        if ('A' <= aCH && aCH <= 'Z') {
            base = 'A';
        }
        else if ('a'<= aCH && aCH <= 'z') {
            base = 'a';
        }
        else{
            return aCH;//Not a letter
        }
    
        int offset = aCH - base + aKEY;
        final int LETTERS = 26;//Number of letters in the roman-latin alphabet
        if (offset > LETTERS) {
            offset = offset - LETTERS;
        }
        else if(offset < 0){
            offset = offset + LETTERS;
        }
        
        return (char) (base + offset);
        
        
      
    }
    public static void usage(){
        System.out.println("Usage: java CaesarCipher [-d] inFile/outFile");
    }
}
