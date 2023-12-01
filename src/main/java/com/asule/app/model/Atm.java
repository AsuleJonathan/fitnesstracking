package com.asule.app.model;


import com.asule.app.view.helper.HtmlForm;
import com.asule.app.view.helper.HtmlFormField;
import com.asule.app.view.helper.HtmlTable;
import com.asule.app.view.helper.HtmlTableColHeader;

import java.math.BigDecimal;

@HtmlTable(addUrl = "./atm?action=add")
@HtmlForm(label = "Withdrawal Money", url = "./atm")
public class Atm extends BaseEntity{

    public Atm(){}

    public Atm(BigDecimal balance){
        this.balance = balance;
    }

    @HtmlFormField(label = "Withdraw Amount", required = true)
    private BigDecimal withdrawAmount;

    @HtmlTableColHeader(header = "Account Balance", numberFormat = "#,###.00")
    private BigDecimal balance;

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
