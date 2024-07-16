/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author Pana
 * computes the average of the measures of a the given objects
 * @param objects an array of measurable objects
 * @return te average of the measured obj
 */
public class DataMeasure {
    
    public static double average(Measurable[] objects){
    
        double sum = 0;
        for(Measurable objM : objects){
            sum = sum + objM.getMeasure();
        }
        if (objects.length > 0) {
            
            return sum / objects.length;
        }else{
            return 0;
        }
    }
    public static Measurable larger(Measurable obj1, Measurable obj2){
        if (obj1.getMeasure() > obj2.getMeasure()) {
            return obj1;
        }
        else
        {
            return obj2;
        }
    
    }
    
}
