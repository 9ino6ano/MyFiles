/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author Pana
 * A program class with text and answer as instances
 */
public class Question {
    //declare instance variables
    private String Text;
    private String Answer;
    
    //create a default constructor
    //constructs a question with an empty answer
    public Question(){
    Text = "";
    Answer = ""; 
    }
    //create accessor and mutato methods
    //set and retrieve the questin and answer
    public void setText(String quesText){
        this.Text = quesText;
    }
    public void setAnswer(String aCorrectAns){
        this.Answer = aCorrectAns;
    }
    //checks a given response for correctness 
    //@param response, the response to check
    //@return true if correct response else false
    
    public boolean checkAnswer(String response){
        return response.equals(Answer);
    }
    //Display this question
    public void display(){
        System.out.println(Text);
    }
    
}
