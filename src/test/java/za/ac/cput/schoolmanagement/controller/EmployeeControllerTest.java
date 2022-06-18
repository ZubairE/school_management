/*
Author:Ismail Watara
Student_Number: 219018790
Date: 18 June 2022
EmployeeControllerTest
*/
package za.ac.cput.schoolmanagement.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.factory.entityfactory.EmployeeFactory;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.factory.entityfactory.NameFactory;


import javax.lang.model.element.Name;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class EmployeeControllerTest {

    @LocalServerPort
    private int port;
    @Autowired


    private EmployeeController employeeController;
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseUrl;
    private Employee employee;
    private Name name;

    @BeforeEach
    void setUp() {
        assertNotNull(employeeController);
        this.name = NameFactory.getName("Mason","Harry", "Mount");
        this.employee = EmployeeFactory.createEmployee(
                "SW19MM",
                "Starboy19mm@gmail.com",
                name);

        this.baseUrl = "http://localhost:"+ this.port + "/schoolManagement/employee/";
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<Employee> response = this.restTemplate.postForEntity(url,
                this.employee, Employee.class);
        System.out.println(response);
        assertAll(()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
                ()-> assertNotNull(response.getBody())
        );
    }

    @Test
    void read() {
        String url = baseUrl+"read/" + this.employee.getStaffId();
        System.out.println(url);
        ResponseEntity<Employee> response =
                this.restTemplate.getForEntity(url, Employee.class);
                assertAll(()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
                        ()-> assertNotNull(response.getBody()));

    }
    @Test
    void getAll() {
        String url = baseUrl + "all";
        System.out.println(url);
        ResponseEntity<Employee[]> response = this.restTemplate.getForEntity(url,
                Employee[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
                ()-> assertTrue(response.getBody().length == 0));
    }
    @Test
    void delete() {
        String url = baseUrl + "remove/" + this.employee.getStaffId();
        this.restTemplate.delete(url);
    }
}