/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vut;

/**
 *
 * @author Pana
 * computes the average of the measures of the given objects
 * @param objects = an array of objects
 * @param mass = the measurer for the objects
 * @return = the average of the measures
 */
public class Data {
    
    public static double average(Object[] objects, Measure mass){
        double sum = 0;
        for (Object obj : objects) {
            sum = sum + mass.measure(obj);
        }
        if (objects.length > 0) {
            return sum / objects.length;
        }
        else
        {
            return 0;
        }
    
    }
}
