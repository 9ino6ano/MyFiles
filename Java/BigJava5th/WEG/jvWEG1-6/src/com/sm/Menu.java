/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm;

/**
 *
 * @author Pana
 */
public class Menu {
    private String menuText;
    private int optionCount;
    
    public Menu(){
        this.menuText = "";
        this.optionCount = 0;
    }
    public Menu(String mText, int oCount){
        setMenuText(mText);
        setOptionCount(oCount);
    }

    public String getMenuText() {
        return menuText;
    }

    public void setMenuText(String mText) {
        this.menuText = mText;
    }

    public int getOptionCount() {
        return optionCount;
    }

    public void setOptionCount(int opCount) {
        this.optionCount = opCount;
    }

    public void addOption(String option){
        //menuText = menuText.concat(option);
        optionCount = optionCount + 1;
        menuText = menuText + optionCount + ") " + option + "\n";
    }
    public void display(){
        System.out.println("");
    }
    
    @Override
    public String toString() {
        return "Menu{" + "menuText=" + menuText + ", optionCount=" + optionCount + '}';
    }
    
    
}
