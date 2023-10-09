/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invo;

/**
 *
 * @author Pana
 * Describes a mailing address.
 */
public class Address {
   //Declare instance variables relative to an address
    private String Name,Street,City,State,Zip;
    
    /*
    Constructs a mailing address obj with parameters
    @Name   @Street
    @City   @State  @ZIP
    */
    public Address(String aName,String aStreet,
                   String aCity, String aState, String aZip){
        Name = aName;
        Street = aStreet;
        City = aCity;
        State = aState;
        Zip = aZip;
    }
    /*
    formats the address
    @return the address as a string with 3 lines
    */
    public String format(){
        return Name + "\n"+ Street + "\n"
               + City + "," + State + " " + Zip;
    }
    
}
