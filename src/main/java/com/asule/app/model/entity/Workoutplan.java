package com.asule.app.model.entity;

public class Workoutplan {

    private String Title;
    private String Description;
    private String startDate;
    private String endDate;
    
    public Workoutplan(String title, String description, String startDate, String endDate) {
        Title = title;
        Description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    

    public Workoutplan() {
    }


    


    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

 
}