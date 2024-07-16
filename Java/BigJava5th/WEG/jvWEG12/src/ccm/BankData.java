/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *This Bank contains bank customers
 * @author Pana
 */
public class BankData {//Bank
    private ArrayList<Customer> customers;
    
    //CONSTRUCTS A BANK WITH NO CUSTOMERS
    public BankData(){
        customers = new ArrayList<Customer>();
    }
    /**
     *Reads the customer numbers and pins.
     *@param fileName the name of the customer
     */
    public void readCustomers(String fileName) throws IOException{
        Scanner in = new Scanner(new File(fileName));
        while (in.hasNext()) {            
            int number = in.nextInt();
            int pin = in.nextInt();
            Customer c = new Customer(number,pin);
            addCustomer(c);
            
        }
        in.close();
    }
    /**
     Adds a customer to the bank.
     *@param c the customer to add
     */
    public void addCustomer(Customer c){
        customers.add(c);
    }
    /**
     *Finds a constructs, in the bank.
     *@param aNumber a constructor 
     *@param aPin a person identification.
     *@return the matching customer, or null  if no customer
     *matches.
     * 
     */
    public Customer findCustomer(int aNumber, int aPin){
        for (Customer c : customers) {
            if (c.match(aNumber, aPin)) {
                return c;
            }
        }
        return null;
    }
   
    
    
    
}
