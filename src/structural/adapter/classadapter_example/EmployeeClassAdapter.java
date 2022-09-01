package structural.adapter.classadapter_example;

import structural.adapter.Customer;
import structural.adapter.Employee;

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
