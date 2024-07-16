/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Random;

/**
 *
 * @author Pana
 * this class models a dice that, when cast , lands on a random face
 * the intro into random number generation
 */
public class Dice {
    private Random generator;
    private int sides;
    
    /*
    Constructs a dice with a given number of sides
    @PARAMS = the no.sides e.g 6 for a normal die
    
    */
    public Dice(int s){
        generator = new Random();
        sides = s;
        
    }
    /*
    this method simulates what happens when a dice is thrown
    @RETURN = the landed face.
    */
    public int cast(){
        return 1 + generator.nextInt(sides);
    }
}
