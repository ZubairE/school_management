/*
Author:Ismail Watara
Student_Number: 219018790
Date: 18 June 2022
EmployeeFactoryTest.java
*/

package za.ac.cput.schoolmanagement.factory.entityfactory;
import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.factory.entityfactory.NameFactory;


import javax.lang.model.element.Name;

import static org.junit.jupiter.api.Assertions.*;



class EmployeeFactoryTest {


    @Test

    public void buildWithoutError() {
        Name name = NameFactory.buildName("Harry","Smith","Lucason");

        Employee employee = EmployeeFactory.build(
                "HSL10",
                "classA@gmail.com",
                name);


        System.out.println(employee);


        assertNotNull(employee);


    }



    @Test

    public void buildWithError() {
        Name name = NameFactory.buildName("Harry","Smith","Lucas");
        Exception exception =  assertThrows(IllegalArgumentException.class,
                () -> EmployeeFactory.build(
                        null,
                        "classA@gmail.com",
                        name));

        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Staff identification  is needed!", exceptionMessage);



    }


}