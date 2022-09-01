package structural.adapter;

import structural.adapter.classadapter_example.EmployeeClassAdapter;
import structural.adapter.objectadapter_example.EmployeeObjectAdapter;

public class Test {

    public static void main(String[] args) {

        BusinessCardDesigner designer = new BusinessCardDesigner();

        // Using class adapter/two-way adapter (not the preferred way)
        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();

        classAdapter.setEmployeeName("emp1");
        classAdapter.setEmployeeJob("Software Engineer");
        classAdapter.setEmployeeAddress("anywhere");
        System.out.println(designer.designCard(classAdapter));


        // Using object adapter.
        Employee employee = new Employee();
        employee.setEmployeeName("emp2");
        employee.setEmployeeJob("Software Test Engineer");
        employee.setEmployeeAddress("anywhere");

        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        System.out.println(designer.designCard(objectAdapter));

    }

}
