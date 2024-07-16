/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vut;
import java.awt.Rectangle;
/**
 *
 * @author Pana
 * objects of this class measure the rectangles using the area
 */
public class AreaMeasure implements Measure{
   public double measure(Object adaObject){
       Rectangle aRect = (Rectangle) adaObject;
       double area = aRect.getWidth() * aRect.getHeight();
       return area;
   } 
}
