/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurveyMC;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Phil
 */
@ManagedBean
@SessionScoped
public class Survey implements Serializable
{
    private String ratings="@";
    private String comments="@";
    private String instructor="@";
    private String course="@";
    private String termYear="@";

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = this.ratings+"@"+ratings;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = this.comments+"@"+comments;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTermYear() {
        return termYear;
    }

    public void setTermYear(String termYear) {
        this.termYear = termYear;
    }
    
    
    
}
