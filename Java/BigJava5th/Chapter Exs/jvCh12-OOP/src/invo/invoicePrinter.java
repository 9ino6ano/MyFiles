/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invo;

/**
 *
 * @author Pana
 * this program demonstrates the invoice classes by
 * printing a sample invoice
 */
public class invoicePrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Address objAdd1 = new Address("Sam's Small Appliances", "100 Main Street", "A & B City", "CA", "98765");
        Address objAdd2 = new Address("9ino6ano Productions", "96 PanCake Avenue", "Johannesburg", "GP", "1817");
    
        Invoice obj1Inv1 = new Invoice(objAdd1);
        obj1Inv1.addProduct(new Product("Toaster", 29.95),3);
        obj1Inv1.addProduct(new Product("Blender", 24.65),1);
        obj1Inv1.addProduct(new Product("Home Theator", 57.75),2);
        Invoice obj1Inv2 = new Invoice(objAdd2);
        obj1Inv2.addProduct(new Product("Microphone", 29.95),1);
        obj1Inv2.addProduct(new Product("Albums", 14.65),2);
        obj1Inv2.addProduct(new Product("Studio Equipment", 37.75),3);
        
        System.out.println("______________________________________");
        System.out.println("+-+-+-+-+-+Invoice Program 1-+-+-+-+-+-+-");
        System.out.println(obj1Inv1.format());
        System.out.println("______________________________________");
        System.out.println("+-+-+-+-+-+Invoice Program 2-+-+-+-+-+-+-");
        System.out.println(obj1Inv2.format());
        
    
    }   
    
    
}
