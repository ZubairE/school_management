/*
Author:Ismail Watara
Student_Number: 219018790
Date: 18 June 2022
EmployeeFactory.java
*/


package za.ac.cput.schoolmanagement.factory.entityfactory;

import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.helper.HelpStrings;

import javax.lang.model.element.Name;




public class EmployeeFactory {


    public static Employee createEmployee(String staffId, String email, Name name) {
        HelpStrings.checkingStringParam("staffId", staffId);
        HelpStrings.checkingEmailParam("email", email);
        HelpStrings.checkingEntityParam("name", name);


        Employee employee = new Employee.Builder()
                .setStaffId(staffId)
                .setEmail(email)
                .setName(name)
                .build();

        return employee;

    }

    public static Employee build(String staffId, String email, Name name) {
        return null;
    }

}