/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbio;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

/**
 *This class encrypts files using the Caesar Cipher.
 * for decryption use an encryptor whose key is the 
 * negative of the encryption key
 * @author Pana
 */
public class CaesarCipher {
    private int key;
    
    /**
     *Constructs a cipher object with a given key.
     *@param = key - the encryption key
     */
    public CaesarCipher(int aKey){
        key = aKey;
    }
    /**
     *Encrypts the contents of a stream.
     *@param = in - the input stream
     *@param = out - the output stream.
     */
    public void encryptStream(InputStream in, OutputStream out)throws IOException{
    
        boolean done = false;
        while (!done) {            
            int next = in.read();
            if (next == -1) {
                done = true;
            }
            else{
                int encrypted = encrypt(next);
                out.write(encrypted);
            }
        }
    }
    /**
     *Encrypts a value
     * @param b - the value to encrypt [between 0 and 255]
     * @return the encrypted value
     */
    public int encrypt(int b){
        return (b + key) % 256;
    }
    
}
