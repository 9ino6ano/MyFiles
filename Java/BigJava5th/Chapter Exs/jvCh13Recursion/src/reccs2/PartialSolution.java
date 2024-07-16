/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reccs2;
//import an arraylist
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Pana
 * if the partial solution cannot be completed , one abondons it and returns to examining
 * the other candidates
 * BackTracking = is used to solve crosswords, puzzles, escapes from mazes
 * or find the solutions to systems that are constrained by rules.
 */
public class PartialSolution {
    //a partial soulution to the 8 queens puzzle
    private Queen[] queens;
    private static final int No_QUEENS = 8;
    //declare constant variables to access the instance
    public static final int ACCEPT = 1;
    public static final int ABANDON = 2;
    public static final int CONTINUE = 3;
/*
    cONSTRUCTS A PARTIAL SOULUTION OF A GIVEN SIZE
    @param = size to construct solution
    */
    public PartialSolution(int size){
        queens = new Queen[size];
    }
    /*
    Examines the partial solution 
    @return one of the methods accept, abandon, continue
    */
    public int examine(){
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                if (queens[i].attacks(queens[j])) {
                    return ABANDON;
                }
            }
        }
        if (queens.length == No_QUEENS) {
            return ACCEPT;
        }
        else{
            return CONTINUE;
        }
    }
    /*
    Yields all extentions of this partial solution
    @return an array of partial solutions that extend this current solutuion
    */
    public PartialSolution[] extend(){
    // generate a new solution for each column
        PartialSolution[] result = new PartialSolution[No_QUEENS];
        for (int i = 0; i < result.length; i++) {
            int size = queens.length;
            // The new solution has one or more rows than this one
            result[i] = new PartialSolution(size + 1);
            // copy this solution into the new one
            for (int j = 0; j < size; j++) {
                result[i].queens[j] = queens[j];
            }
            //Append the new queen into the ith column
            result[i].queens[size] = new Queen(size, i);
        }
        return result;
    }
    public String toString(){
        return Arrays.toString(queens);
    }

}
