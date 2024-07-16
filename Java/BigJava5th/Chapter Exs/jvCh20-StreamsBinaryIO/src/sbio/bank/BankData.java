/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbio.bank;

import java.io.RandomAccessFile;
import java.io.IOException;

/**
 *This class is a conduit to a random access file
 *containing bank accounts records.
 * @author Pana
 */
public class BankData {
    
    private RandomAccessFile file;
    
    public static final int INT_SIZE = 4;
    public static final int DOUBLE_SIZE = 8;
    public static final int RECORD_SIZE = INT_SIZE + DOUBLE_SIZE;
    /**
     *Constructs a BankData object that is not associaed with a file
     */
    public BankData(){
        file = null;
    }
    /**
     *Opens a data file
     *@param = fileName - the name of the file containing bank
     * account information
     */
    public void open(String fileName) throws IOException{
        if (file != null) {
            file.close();
        }
        file = new RandomAccessFile(fileName, "rw");
    }
    /**
     *Gets the number of accounts in the file
     *@return = the number of accounts
     */
    public int size() throws IOException {
        return (int) (file.length() / RECORD_SIZE);
    }
    //closes the data file
    public void close() throws IOException{
        if (file != null) {
            file.close();
        }
        file = null;
    }
    /**
     *Reads a bank account record.
     *@param = n - the index of the account in the data file.
     *@return = bank account object initialized with the file data
     */
    public BankAccount read(int n) throws IOException{
        file.seek(n * RECORD_SIZE);
        int accountNumber = file.readInt();
        double balance = file.readDouble();
        return new BankAccount(balance, accountNumber);
    }
    /**
     *Finds the position of a bank account with a given number.
     *@param = accountNumber - the number to find
     *@return = position - the account with the given number,
     *or -1 if there is no such account
     */
    public int find(int accountNumber) throws IOException{
        for (int i = 0; i < size(); i++) {
            file.seek(i * RECORD_SIZE);
            int a = file.readInt();
            if (a == accountNumber) {
                return i;
            }
            //found a match
        }
        return -1; // no match in the entire file
    }
    /**
     *Writes a bank account record to the data file.
     *@param = n - the index of the account in the data file.
     *@param account - the account to write
     */
    public void write(int n, BankAccount objAcc) throws IOException{
        file.seek(n * RECORD_SIZE);
        file.writeInt(objAcc.getAccountNumber());
        file.writeDouble(objAcc.getAccountBalance());
    }
    
    
}
