/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

/**
 *
 * @author Pana
 */
public class StudentViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This System Emulates The Student Registration Process.\nIncluding Add, Remove or Updated from the Database =[DB-student_demo = TBL-studentsrec]");
    
        new Stud_Registration().setVisible(true);
    }
    
}
