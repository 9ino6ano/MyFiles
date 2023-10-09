/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.lang.Object;
/**
 *
 * @author Pana
 */
public class Day extends Object{
    //Variables relative to a date object
    private int Year;
    private int Month;
    private int Date;
    //constructors
    public Day(){
    
    }
    //Parameterized constructors
    public Day( int aYear, int aMonth, int aDate){
       /**
        *  this.Year = aYear;
        this.Month = aMonth;
        this.Date = aDate;
        */
        setYear(aYear);
        setMonth(aMonth);
        setDate(aDate);
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int aYear) {
        this.Year = aYear;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int aMonth) {
        this.Month = aMonth;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int aDate) {
        this.Date = aDate;
    }
    //Adding days
    //public int addDays(){}
    //a method for returning the number of days alive
    //public Day daysFrom(Day objOther){}
    
    @Override
    public String toString() {
        return "Day{" + "Year=" + Year + ", Month=" + Month + ", Date=" + Date + '}';
    }
    
    
}
