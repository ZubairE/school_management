/*
Author:Ismail Watara
Student_Number: 219018790
Date: 18 June 2022
EmployeeServiceTest.java
*/
package za.ac.cput.schoolmanagement.service.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.factory.entityfactory.EmployeeFactory;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.factory.entityfactory.NameFactory;
import javax.lang.model.element.Name;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;




@SpringBootTest

class EmployeeServiceImplTest {

    private Name name;
    private Employee employee;
    @Autowired
    private IEmployeeService service;

    @BeforeEach

    void setUp() {
        this.name = NameFactory.getName("John","Mensah","Boyega");
        this.employee = EmployeeFactory.createEmployee(
                "JMBSW14",
                "2014StarwarsLead@gmail.com",
                name);

    }



    @AfterEach

    void tearDown(){


        this.service.delete(this.employee);

    }



    @Test


    void save() {


        Employee saved =
                this.service.save(this.employee);


        System.out.println(saved);


        assertNotNull(saved);


        assertSame(this.employee,
                saved);

    }



    @Test


    void read() {
        Employee saved = this.service.save(this.employee);
        Optional<Employee> read = this.service.read(employee.getStaffId());
        assertAll(()->assertTrue(read.isPresent()),
                ()->assertSame(saved, read.get()));
    }
    @Test
    void delete() {
        Employee saved = this.service.save(this.employee);
        this.service.delete(saved);
        List<Employee> employeeSet = this.service.getAll();
        assertEquals(0,employeeSet.size());
    }



    @Test
    void getAll() {
        this.service.save(this.employee);
        List<Employee> employeeSet = this.service.getAll();
        assertEquals(1,employeeSet.size());
    }

}