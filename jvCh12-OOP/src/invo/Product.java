/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invo;

/**
 *
 * @author Pana
 * Describes a product with a description and a price
 */
public class Product {
    private String Description;
    private Double Price;
    /*
    constructs a product from a description and a price
    @param = aDescription of the product
    @param = aPrice of the product
    */
    public Product(String aDesc, double aPrice){
        Description = aDesc;
        Price = aPrice;
    }
    /*
    Gets the product of the description 
    @return the description
    */
    public String getDescription(){
        return Description;
    }
    /*
    Gets the product of the price
    @return the price per unit
    */
    public double getPrice(){
        return Price;
    }
    
    
}
