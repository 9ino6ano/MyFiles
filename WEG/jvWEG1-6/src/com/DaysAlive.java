/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.lang.Object;
/**
 *All internals regarding date/calculations is carried by the day class
 * Check API Docx. for more methods used by this class
 * @author Pana
 */
public class DaysAlive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Day objNino = new Day(1996, 12, 7);
        Day objToday = new Day();
        System.out.print("Today`s Date is: ");
        System.out.println(objToday.toString());
        //int daysAlive = objToday.daysFrom(objNino);
        System.out.print("Days Alive: ");
        //System.out.println(daysAlive);
       
    }
    
}
