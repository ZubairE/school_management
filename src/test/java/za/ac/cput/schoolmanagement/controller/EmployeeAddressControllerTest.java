package za.ac.cput.schoolmanagement.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;
import za.ac.cput.schoolmanagement.factory.EmployeeAddressFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class EmployeeAddressControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private EmployeeAddressController controller;
    @Autowired private TestRestTemplate restTemplate;
    private EmployeeAddress employeeAddress;
    private String baseUrl;

    @BeforeEach
    void setUp(){
        this.employeeAddress = EmployeeAddressFactory.build("staffId", "address");
        this.baseUrl = "http://localhost:" + this.port + "/school/employee-address";
    }

    @Test
    void save() {
        String url = baseUrl + "save";
        System.out.println((url));
        ResponseEntity<EmployeeAddress>response = this.restTemplate.postForEntity(url, this.employeeAddress, EmployeeAddress.class);
        System.out.println(response);
        assertAll(()->assertEquals(HttpStatus.OK, response.getStatusCode()), ()->assertNotNull(response.getBody()));
    }
}