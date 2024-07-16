/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;
import java.util.ArrayList;
/**
 *
 * @author Pana
 * this class if for question with multiple choice
 * declare an array of choices
 * 
 * Use inheritance to extend the Question class, and be able to manipulate its methods
 */
public class ChoiceQuestion extends Question{
    //instantiate the choices variable
    private ArrayList<String> Choices;
    
    //construct a default choice question with no choices
    public ChoiceQuestion(){
        Choices = new ArrayList<String>();
    }
    //create a method that adds an answer to a list of questions
    //@param = choice to add
    //@param = correct, checks to see if the answer is correctTRUE/wrongFALSE
    public void addChoice(String qChoice, boolean chkCorrect){
        Choices.add(qChoice);
        if (chkCorrect) {
            //convert all choices entered in array to string
            String choiceString = "" + Choices.size();
            setAnswer(choiceString);
        }
    }
    //create a display method , the same as in the super class although
    //override by using a different implentation
    public void display(){
        //1st call the Base display method, inorder to display the question text
        //If you dont put super. the method calls itself over and over again
        super.display();
        //display answer choices from an array list
        for (int i = 0; i < Choices.size(); i++) {
            //declare a local index variable for question placement
            int choiceNo = 1 + i;
            System.out.println(choiceNo+" : "+Choices.get(i));      
            //display the local variable with the  question fro the array list
        }
    }
    
    
}
