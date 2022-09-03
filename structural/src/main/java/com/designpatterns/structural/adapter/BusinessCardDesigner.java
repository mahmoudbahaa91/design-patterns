package com.designpatterns.structural.adapter;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        String card = "";
        card += customer.getCustomerName();
        card += "\n" + customer.getCustomerJob();
        card += "\n" + customer.getCustomerAddress();
        return card;
    }
}
