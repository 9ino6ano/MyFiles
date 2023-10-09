/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reccs2;

/**
 *
 * @author Pana
 * Backtracking is a problem sokving technique that builds up partial solutions that
 * get closer to reaching their goal.
 */
public class EightQueens {

    /**
     * @param args the command line arguments
     * This class solves the 8 queens problem using back-tracing
     */
    public static void main(String[] args) {
        // TODO code application logic here
        solve(new PartialSolution(0));
    }
    public static void solve(PartialSolution sol){
        int exam = sol.examine();
        if (exam == PartialSolution.ACCEPT) {
            System.out.println(sol);
        }
        else if (exam == PartialSolution.CONTINUE) {
            for (PartialSolution p : sol.extend()) {
                solve(p);
            }
        }
    }
}
