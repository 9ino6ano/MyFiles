/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 *
 * @author Pana
 */
public class Job {
    private String jobTitle;
    private String jobDepartment;
    
    public Job(String jTitle, String jDept){
        setJobTitle(jTitle);
        setJobDepartment(jDept);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jTitle) {
        if (jTitle.length() < 4) {
            throw new IllegalArgumentException("The Job Field is too short.");
        }
        else{
        
            this.jobTitle = jTitle;
        }
        
    }

    public String getJobDepartment() {
        return jobDepartment;
    }

    public void setJobDepartment(String jDepartment) {
        if (jDepartment.length() <= 4) {
            throw new IllegalArgumentException("The Department Filed is too short.");
        }
        else{
        
            this.jobDepartment = jDepartment;
        }
        
    }

    @Override
    public String toString() {
        return "Job{" + "jobTitle=" + jobTitle + ", jobDepartment=" + jobDepartment + '}';
    }
    
}
