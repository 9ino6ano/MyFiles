/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invo;
import java.util.ArrayList;
// import an array that will compute all line items
/**
 *
 * @author Pana
 * This program demonstrates the invoice classes by 
 * printing a sample invoice.
 * DESCRIBES AN INVOICE FOR A SET OF PURCHASED PRODUCTS
 */
public class Invoice {
    //declare instance variables, relative to an invoice
    private Address BillingAddress;
    private ArrayList<LineItem> Item;
    
    /*
    Constructs an invoice.
    @param = adAddress for billing
    */
    public Invoice(Address aAddress){
        BillingAddress = aAddress;
        Item = new ArrayList<LineItem>();
    }
    /*
    Adds a charge for a product to this invoice.
    @param = AProduct; the product that the customer ordered.
    @param = Aquanting; the quantity of the product.
    */
    public void addProduct(Product aProd, int aQuantity){
        LineItem objItem = new LineItem(aProd,aQuantity);
        Item.add(objItem);
                
    }
    /*
    Formats the invoice
    @return = the invoice after format
    */
    public String format(){
        String objR = "                 INVOICE\n\n"
                + BillingAddress.format()
                + String.format("\n\n%-30s%8s%5s%8s\n",
                "Discription ","Price","Qty","Total");
        
        for (LineItem objItem : Item) {
            objR = objR + objItem.format() + "\n";
        }
        objR = objR + String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());
        return objR;
    }
    /*
    Computes the total amount due.
    @return the amount due
    */
    private double getAmountDue(){
        double amountDue = 0;
        for (LineItem objIt : Item) {
            amountDue = amountDue + objIt.getTotalPrice();
        }
        return amountDue;
    }
    
    
    
    
}




