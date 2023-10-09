/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author Pana
 */
//this class models a tall counter
public class Counter {
/*
    gets the current value of this counter.
    */
    private int value;
    //@return the current value
    public int getValue(){
    
        return value;
    }
    //advances/increments the tally counter by 1.
    public void click(){
    
        value = value + 1;
    }
    // resets the value of the counte to 0
    public void reset(){
        value = 0;
    }

}
