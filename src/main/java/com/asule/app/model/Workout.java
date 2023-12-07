package com.asule.app.model;

import com.asule.app.view.helper.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "workout")
@HtmlTable(addUrl = "./workout?action=add")
@HtmlForm(label = "workout", url = "./workout")
public class Workout extends BaseEntity {

    @Column(name = "workout_date")
    @Temporal(TemporalType.DATE)
    @HtmlTableColHeader(header = "Date", dateFormat = "dd/MM/yyy")
    @HtmlFormField(label = "workout Date", type = HtmlFormFieldType.DATE, required = true)
    private Date workoutDate;

    @Column(name = "workout_no")
    @HtmlTableColHeader(header = "workout Number")
    private String workoutNo;



    @Column(name = "narration",columnDefinition = "text")
    @HtmlTableColHeader(header = "Narration")
    @HtmlFormField(label = "Narration", required = true)
    private String narration;

    @Transient
    private Fitness fitness;

   public Date getworkoutDate() {
        return workoutDate;
    }

    public void setworkoutDate(Date workoutDate) {
        this.workoutDate = workoutDate;
    }

    public String getworkoutNo() {
        return workoutNo;
    }

    public void setworkoutNo(String workoutNo) {
        this.workoutNo = workoutNo;
    }

    public Fitness getfitness() {
        return fitness;
    }

    public void setfitness(Fitness fitness) {
        this.fitness = fitness;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }
}
