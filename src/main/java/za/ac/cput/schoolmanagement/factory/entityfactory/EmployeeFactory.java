/*
Author:Ismail Watara
Student_Number: 219018790
Date: 10 June 2022
EmployeeFactory.java
*/


package za.ac.cput.schoolmanagement.factory.entityfactory;
import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.helper.HelpStrings;


public class EmployeeFactory {

    public static Employee createEmployee(String staffId, String email, String firstName, String middleName, String lastName) {

            HelpStrings.checkStringParam("staffId", staffId);
            HelpStrings.checkStringParam("email", email);
            HelpStrings.checkStringParam("firstName", firstName);
            HelpStrings.checkStringParam("middleName", middleName);
            HelpStrings.checkStringParam("lastName", lastName);

            return new Employee.Builder()
                    .setStaffId(staffId)
                    .setEmail(email)
                    .setFirstName(firstName)
                    .setMiddleName(middleName)
                    .setLastName(lastName)
                    .build();

        }


    }
