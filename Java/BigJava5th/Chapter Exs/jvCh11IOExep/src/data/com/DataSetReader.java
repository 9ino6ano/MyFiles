/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.com;
//include all packages neccessary for
//1 = file access 2 = exeption handling
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Pana
 * Reads the data from a file. The file must have the format numberOfValues.
 * Value_1
 * Value_2
 * Value_3
 */
public class DataSetReader {
    private double[] Data;
    
    /*
    THIS PROGRAM IS FOR ERROR-DETECTION OF THE DATASET.READVALUE METHOD
    Reads a data set.
    @param = filename of the file holding the data
    @return = the data in the file
    
    */
    public double[] readFile(String fileName) throws IOException{
    File objFile = new File(fileName);
    Scanner sc = new Scanner(objFile);
        try {
            readData(sc);
            return Data;
        } 
        finally {
            sc.close();
        }
    
    }
    /*
    reads all the data
    @param = the scanner that scans the data
    // this method throws an Bad Data Exeption
    */
    public void readData(Scanner in) throws BadDataException {
    
        if (in.hasNextInt()) {
            throw new BadDataException("The Length is Expected.");
        }
        int numberOfValues = in.nextInt();
        Data = new double[numberOfValues];
       
        for (int i = 0; i < numberOfValues; i++) {
            readValue(in,i);
        }
        if (in.hasNext()) {
            throw new BadDataException("End Of File is expected.");
        }
    }
    /*
    Reads one data value @ a time
     @param = in; the scanner that reads the data
     @param = i; the position of the value to read
    
    */
    public void readValue(Scanner sc, int i) throws BadDataException{
        if (sc.hasNextDouble()) {
            throw new BadDataException("Data Value Expected.");    
        }
        Data[i] = sc.nextDouble();
        
        
    }
    
}
