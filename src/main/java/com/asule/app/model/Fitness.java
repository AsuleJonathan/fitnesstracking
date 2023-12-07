package com.asule.app.model;

import com.asule.app.view.helper.*;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "fitnesss")
@HtmlTable(addUrl = "./fitnesss?action=add")
@HtmlForm(label = "fitness", url = "./fitnesss")
public class Fitness extends BaseEntity {

    @HtmlTableColHeader(header = "Date", dateFormat = "dd MMM yyyy")
    @Column(name = "txn_date")
    @Temporal(TemporalType.DATE)
    @HtmlFormField(label = "Transaction Date", type = HtmlFormFieldType.DATE, required = true)
    private Date date;

    @Column(name = "fitness_no", nullable = false, unique = true)
    @HtmlTableColHeader(header = "fitness No")
    private String fitnessNo;

    @Column(name = "particulars", columnDefinition = "longtext")
    @HtmlTableColHeader(header = "Particulars")
    @HtmlFormField(label = "Particulars", required = true)
    private String memo;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getfitnessNo() {
        return fitnessNo;
    }

    public void setfitnessNo(String fitnessNo) {
        this.fitnessNo = fitnessNo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

}
