package com.designpatterns.structural.adapter.classadapter_example;

import com.designpatterns.structural.adapter.Customer;
import com.designpatterns.structural.adapter.Employee;

public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getCustomerName() {
        return this.getEmployeeName();
    }

    @Override
    public String getCustomerJob() {
        return this.getEmployeeJob();
    }

    @Override
    public String getCustomerAddress() {
        return this.getEmployeeAddress();
    }

}
