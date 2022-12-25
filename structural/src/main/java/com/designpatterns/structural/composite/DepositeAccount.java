package com.designpatterns.structural.composite;

import java.math.BigDecimal;

public class DepositeAccount extends  Account {

    private String accountNo;

    private BigDecimal accountBalance;

    public DepositeAccount(String accountNo, BigDecimal accountBalance){
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    @Override
    public BigDecimal getBalance() {
        return accountBalance;
    }

}
