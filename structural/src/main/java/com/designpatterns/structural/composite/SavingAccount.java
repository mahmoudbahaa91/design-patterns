package com.designpatterns.structural.composite;

import java.math.BigDecimal;

public class SavingAccount extends  Account{

    private String accountNo;

    private BigDecimal accountBalance;

    public SavingAccount( String accountNo, BigDecimal accountBalance){
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    @Override
    public BigDecimal getBalance() {
        return accountBalance;
    }
}
