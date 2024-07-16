/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reccs2;

/**
 *
 * @author Pana
 * The queen of the 8 queens problem
 */
public class Queen {
    private int row;
    private int column;
    
    public Queen(int r, int c){
        row = r;
        column = c;
    }
    /*
    Checks whether this queen attack another
    @param other = the other queen
    @return true = if this queen and the other queen ore on the same
    row/column or diagonal
    */
    public boolean attacks(Queen other){
        return row == other.row
                || column == other.column
                || Math.abs(row - other.row)==Math.abs(column - other.column);
    }
    public String toString(){
        return ""+"abcdefg".charAt(column) + (row + 1);
    }
    
}
