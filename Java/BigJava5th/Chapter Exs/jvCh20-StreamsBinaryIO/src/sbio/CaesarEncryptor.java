/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *This program encrypts a file, using the caesar cipher
 * @author Pana
 */
public class CaesarEncryptor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Input File: ");
            String inFile = in.next();
            System.out.print("Output File: ");
            String outFile = in.next();
            System.out.print("Encryption Key: ");
            int key = in.nextInt();
            
            InputStream inStream = new FileInputStream(inFile);
            OutputStream outStream = new FileOutputStream(outFile);
            
            CaesarCipher cipher = new CaesarCipher(key);
            cipher.encryptStream(inStream, outStream);
            inStream.close();
            outStream.close();
        } catch (IOException e) {
            
            System.out.println("Error in processin the file: "+ e);
        }
    }
    
}
