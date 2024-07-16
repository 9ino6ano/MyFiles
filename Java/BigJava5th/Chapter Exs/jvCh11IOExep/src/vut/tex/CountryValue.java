/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.tex;

/**
 *
 * @author Pana
 * this program describes a value that is associated with a country
 */
public class CountryValue {
    private String Country;
    private double Value;
    
    /*
    Constructs a CountryValue from an input line
    @param line - a line containing a country name , followed
    by a value.
    */
    
    public CountryValue(String line){
        int i = 0;// LOCATE THE START OF THE FIRST DIGIT
        while(!Character.isDigit(line.charAt(i))) {            
            i++; // LOCATE THE END OF THE PRECEDING WORD
        }
        int j = 0;
        while(!Character.isWhitespace(line.charAt(j))){
            j--;
        }
        Country = line.substring(0,j + 1); //EXTRACT THE COUNTRY NAME
        Value = Double.parseDouble(line.substring(i).trim()); //EXTRACT THE VALUE
    }
    //Gets the country name, @return the country name
    public String getCountry(){return Country;}
    public double getValue(){return Value;}
    
}
