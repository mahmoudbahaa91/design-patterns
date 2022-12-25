package com.designpatterns.structural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompositeAccount extends  Account {

    private BigDecimal totalBalance;

    private List<Account> accountList = new ArrayList<Account>();

    @Override
    public BigDecimal getBalance() {
        totalBalance = new BigDecimal(0);
        for (Account acc : accountList) {
            totalBalance = totalBalance.add(acc.getBalance())   ;
        }
        return totalBalance;
    }

    public void addAccount(Account acc) {
        accountList.add(acc);
    }

    public void removeAccount(Account acc) {
        accountList.add(acc);
    }

}
