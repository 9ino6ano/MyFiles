/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 *
 * @author Pana
 * this program show a simple quiz with one question
 */
public class QuestionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //declare a scanner object of input
        
        Question q = new Question();
        //construct an object to access methods of the question class
        //then invoke the answer and questiron methods
        System.out.println("=-=-=-=-=PROGRAM 1-=-=-=-==-==-=");
        q.setText("Who was the inventor of Java? ");
        q.setAnswer("James Gosling");
        //call the display method to display the question
        q.display();
        //create a variable for storing answer the call the check answer method
        //if true display true , false if otherwise
        System.out.print("Your anser is: ");
        String resp = sc.nextLine();
        System.out.println(q.checkAnswer(resp));
        ///Question program  2 = extension
        System.out.println("*-*-*-*-*-*PROGRAM 2 -*-*-*-*-*-*-*-");
        //this program shows a simple quiz wiht two choice questions
        //declare a choice question object and call the methods 
        //set the questions and provide a sample no of answers
        
        ChoiceQuestion cq1 = new ChoiceQuestion();
        cq1.setText("What was the original name of the Java Language? ");
        cq1.addChoice("*7", false);
        cq1.addChoice("Duke", false);
        cq1.addChoice("Oak", true);
        cq1.addChoice("Gosling", false);
        
        ChoiceQuestion cq2 = new ChoiceQuestion();
        cq2.setText("In Which Country Was The Creator/Inventor Of Java born? ");
        cq2.addChoice("Australia", false);
        cq2.addChoice("Zimbabwe", false);
        cq2.addChoice("England", false);
        cq2.addChoice("Canada", true);
        
        ChoiceQuestion cq3 = new ChoiceQuestion();
        cq3.setText("What Does The java IDE use run a program? ");
        cq3.addChoice("Source_Code - Compiler - Virtual Machine - *Program", true);
        cq3.addChoice("Compiler - Source_Code - Program - *Virtual Machine", false);
        cq3.addChoice("Virtual Machine - Source_Code - Compiler - *Program", false);
        cq3.addChoice("Program - Source_Code - Virtual Machine - Compiler", false);
        
        presentQuestion(cq1);
        presentQuestion(cq2);
        presentQuestion(cq3);
        System.out.println("________PROGRAM 3_________");
        // PROGRAM 1 AND 2 , WHERE 2 DIFFERENT QUESTION TYPES
        // PRORAM  3 IS A COMBINATION OF BOTH
        Question q1 = new Question();
        q1.setText("Who was the Creator Of 9ino6ano? ");
        q1.setAnswer("Pancake tha dj");
        ChoiceQuestion cqu1 = new ChoiceQuestion();
        cqu1.setText("What is the Main Idea proposed by the Production? ");
        cqu1.addChoice("Music -> Videography -> Choreography", true);
        cqu1.addChoice("Games -> Movies -> Athletics", false);
        cqu1.addChoice("Shoes -> Fashion -> Beauty", false);
        Question q2 = new Question();
        q2.setText("Who was the creator of $toute_Panze? ");
        q2.setAnswer("9ino6ano");
        ChoiceQuestion cqu2 = new ChoiceQuestion();
        cqu2.setText("What is needed to write a Java program? [Choose 1/2]? ");
        cqu2.addChoice("Text Editor -> Compiler -> Virtual Machine -> Source Code", false);
        cqu2.addChoice("Integrated Developing Environment", true);
        cqu2.addChoice("Text Editor -> Source Code -> Compilor -> Virtual Machine", true);
        cqu2.addChoice("None Of The Above", false);
        //display all the question associated in this program
        //2 fill in questions + 2 choice list questions
        //call the present method
        presentQuestion(q1);
        presentQuestion(cqu1);
        presentQuestion(q2);
        presentQuestion(cqu2);
        
    }
    //provide a method , that presents a question to the user
    //thereafter checks the response
    //@param = q the question
    public static void presentQuestion(Question q){
    
        q.display();
        System.out.println("Your Answer is: ");
        Scanner x = new Scanner(System.in);
        String res = x.nextLine();
        System.out.println(q.checkAnswer(res));
    
    }
    public static void presentQuestion(ChoiceQuestion cques){
        cques.display();
        //display the overrideen message from the choice question class
        System.out.print("Your Answer is: ");
        Scanner in = new Scanner(System.in);
        String respAns = in.nextLine();
        System.out.println(cques.checkAnswer(respAns));
        //Create new scanner object for input access
        // then display the message only if answer is true/false
        
    }
    
}
