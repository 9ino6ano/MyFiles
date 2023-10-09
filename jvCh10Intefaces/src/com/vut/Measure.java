/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vut;

/**
 *
 * @author Pana
 * describes a class whose objects can measure another object
 */
public interface Measure {
   /*
    computes the measure of an object
    @param adaObject = the object to be measured
    @return the measure
    */ 
    double measure(Object adaObject);
}
