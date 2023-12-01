package com.asule.app.model;

import com.asule.app.view.helper.*;
import com.asule.database.helper.DbTable;
import com.asule.database.helper.DbTableColumn;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@DbTable(name = "fitness")
@HtmlTable(addUrl = ".fitness?action=add")
@HtmlForm(label = "Journal", url = ".fitness")
public class Fitness extends BaseEntity {

    @HtmlTableColHeader(header = "Date", dateFormat = "dd MMM yyyy")
    @DbTableColumn(name = "txn_date", definition = "DATE")
    @HtmlFormField(label = "Transaction Date", type = HtmlFormFieldType.DATE, required = true)
    private Date date;

    @DbTableColumn(name = "journal_no")
    @HtmlTableColHeader(header = "Journal No")
    private String journalNo;

    @DbTableColumn(name = "particulars")
    @HtmlTableColHeader(header = "Particulars")
    @HtmlFormField(label = "Particulars", required = true)
    private String memo;

    @DbTableColumn(name = "debit", definition = "decimal(10,2)")
    @HtmlTableColHeader(header = "Debit", numberFormat = "#,###.00")
    @HtmlFormField(label = "Debit Amount", type = HtmlFormFieldType.NUMBER)
    private BigDecimal debitBalance;

    @DbTableColumn(name = "credit", definition = "decimal(10,2)")
    @HtmlTableColHeader(header = "Credit", numberFormat = "#,###.00")
    @HtmlFormField(label = "Credit Amount", type = HtmlFormFieldType.NUMBER)
    private BigDecimal creditBalance;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getJournalNo() {
        return journalNo;
    }

    public void setJournalNo(String journalNo) {
        this.journalNo = journalNo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public BigDecimal getDebitBalance() {
        return debitBalance;
    }

    public void setDebitBalance(BigDecimal debitBalance) {
        this.debitBalance = debitBalance;
    }

    public BigDecimal getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(BigDecimal creditBalance) {
        this.creditBalance = creditBalance;
    }
}
