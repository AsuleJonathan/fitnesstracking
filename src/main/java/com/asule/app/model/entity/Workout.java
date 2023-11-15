package com.asule.app.model.entity;



import com.asule.app.view.html.AsuleHtmlForm;
import com.asule.app.view.html.AsuleHtmlFormField;
import com.asule.app.view.html.AsuleTableColHeader; 
import java.io.Serializable;


@AsuleHtmlForm (label = "Workout", url = "./workout")
public class Workout implements Serializable {

    @AsuleTableColHeader (header = "Name")
    @AsuleHtmlFormField(label = "Member Name")
    public String name;

    @AsuleTableColHeader (header = "Gender")
    @AsuleHtmlFormField(label = "Member Gender")
    public String gender;
    
    @AsuleTableColHeader (header = "Workout")
    @AsuleHtmlFormField(label = "Member workout")
    public String workout;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

     public String getWorkout() {
        return workout;
    }

    public void setWorkout(String workout) {
        this.workout = workout;
    }


    
}

