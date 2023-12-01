package com.asule.app.model;

import com.asule.app.view.helper.*;
import com.asule.database.helper.DbTable;
import com.asule.database.helper.DbTableColumn;

import java.math.BigDecimal;
import java.util.Date;


@DbTable(name = "workouts")
@HtmlTable(addUrl = "./workouts?action=add")
@HtmlForm(label = "Invoice", url = "./workouts")
public class Workout extends BaseEntity {

    @HtmlTableColHeader(header = "Date", dateFormat = "dd/MM/yyy")
    @HtmlFormField(label = "Invoice Date", type = HtmlFormFieldType.DATE, required = true)
    private Date invoiceDate;

    @DbTableColumn(name = "invoice_no")
    @HtmlTableColHeader(header = "Invoice Number")
    @HtmlFormField(label = "Invoice Number", required = true)
    private String invoiceNo;

    @DbTableColumn(name = "total")
    @HtmlTableColHeader(header = "Total", numberFormat = "#,###.##")
    private BigDecimal total;

    @DbTableColumn(name = "narration")
    @HtmlTableColHeader(header = "Narration")
    @HtmlFormField(label = "Narration", required = true)
    private String narration;

    private Fitness journal;

   public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Fitness getJournal() {
        return journal;
    }

    public void setJournal(Fitness journal) {
        this.journal = journal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }
}
