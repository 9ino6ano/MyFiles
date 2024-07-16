/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvfrm;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 *
 * @author Pana
 * This program demonstrates the linked list class
 */
public class ListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> staff = new LinkedList<String>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");
        // | IN THE COMMENTS INDICATES THE ITERATOR
        ListIterator<String> iter = staff.listIterator();//|DHRT
        iter.next();// D|HRT
        iter.next();// DH|RT
        
        //ADD MORE ELEMENTS AFTER SECOND ELEMENT
        iter.add("Juliet");//DHJ|RT
        iter.add("Nina");//DHJN|RT
        
        iter.next();//DHJNR|T
        // PRINT ALL ELEMENTS IN THE ARRAY
        System.out.println(staff);
        System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
        
        
    }
    
}
