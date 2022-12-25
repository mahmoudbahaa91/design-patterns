package com.designpatterns.structural.composite;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        
        CompositeAccount compositeAccount = new CompositeAccount();

        compositeAccount.addAccount(new DepositeAccount("DA001", new BigDecimal(150)));
        compositeAccount.addAccount(new DepositeAccount("DA002", new BigDecimal(150)));
        compositeAccount.addAccount(new SavingAccount("SA001", new BigDecimal(200)));

        BigDecimal totalBalance = compositeAccount.getBalance();
        System.out.println("Total Balance : " + totalBalance);
    }

}
