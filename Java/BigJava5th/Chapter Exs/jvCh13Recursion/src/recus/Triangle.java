/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recus;

/**
 *
 * @author Pana
 * A triangular shape composed of stacked units squares like this
 * []
 * [][]
 * [][][]
 */
public class Triangle {
    //declare a class instance
    private int Width;
    /*
    Constructs a triagular shape.
    @param = width (and height) of the triangle
    */
    public Triangle(int aWidth){
        Width = aWidth;
    }
    /*
    Computes the area of a triangle
    @return = the area
    */
    public int getArea(){
        if (Width <= 0 ) {
            return 0;
        }
        else if (Width == 1) {
            return 1;
        }
        else{
            Triangle smallTri = new Triangle(Width - 1);
            int smallerArea = smallTri.getArea();
            return smallerArea + Width;
        }
    }
    
}
