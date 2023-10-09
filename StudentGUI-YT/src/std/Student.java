/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;
import java.io.*;
/**
 *
 * @author Pana
 */
public class Student implements Serializable {
    private String StName;
    private String SSurname;
    private Course objCourse;
    private int StNo;

    public Student() {
        this.StName = "";
        this.SSurname = "";
        this.objCourse = null;
        this.StNo = 0;
    }

    public Student(String sName, String sSurname, Course sCourse, int sNo) {
        //this.StName = sName;
        //this.SSurname = sSurname;
        //this.objCourse = sCourse;
        //this.StNo = sNo;
        setStName(sName);
        setSSurname(sSurname);
        setObjCourse(sCourse);
        setStNo(sNo);
        
    }

    public String getStName() {
        return StName;
    }

    public void setStName(String stName) {
        this.StName = stName;
    }

    public String getSSurname() {
        return SSurname;
    }

    public void setSSurname(String stSurname) {
        this.SSurname = stSurname;
    }

    public Course getObjCourse() {
        return objCourse;
    }

    public void setObjCourse(Course stCourse) {
        this.objCourse = stCourse;
    }

    public int getStNo() {
        return StNo;
    }

    public void setStNo(int stNo) {
        this.StNo = stNo;
    }

    @Override
    public String toString() {
        return "Student{" + "StName=" + StName + ", SSurname=" + SSurname + ", objCourse=" + objCourse + ", StNo=" + StNo + '}';
    }
    
     
    
}
