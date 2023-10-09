/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invo;

/**
 *
 * @author Pana
 * Describes a quantity of an item to be purchased
 */
public class LineItem {
    private int Quantity;
    private Product actProduct;
    
    /*
    Constructs an item from the poduct and quantity
    @param = Aproduct; the actual product object
    @param = Aquantity; the number of the actual item 
    */
    public LineItem(Product aProduct, int aQuantity){
        actProduct = aProduct;
        Quantity = aQuantity;
    }
    /*
    Computes the toal cost of this line item.
    @return the total price
    */
    public double getTotalPrice(){
        return actProduct.getPrice() * Quantity;
    }
    /*
    formats this item
    @ returns a formatted string of line item.
    */
    public String format(){
        return String.format("%-30s%8.2f%5d%8.2f",
                actProduct.getDescription(),actProduct.getPrice(),
                Quantity,getTotalPrice());
    }
}
