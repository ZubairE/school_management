/**
 * CityControllerTest.java
 * City Controller Test class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 18 June 2022
 */

package za.ac.cput.schoolmanagement.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.factory.entityfactory.CityFactory;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CityControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private CityController cityController;
    @Autowired
    private TestRestTemplate restTemplate;

    private String baseUrl;
    private City city;


    @BeforeEach
    void setUp() {
        assertNotNull(cityController);
        this.city = CityFactory.build("", "", "");
        this.baseUrl = "http://localhost:" + this.port + "/schoolManagement/city/";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<City> response = this.restTemplate.postForEntity(url, this.city, City.class);
        System.out.println(response);
        assertAll(() -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void read() {
        String url = baseUrl + "read/" + this.city.getId();
        System.out.println(url);
        ResponseEntity<City> response = this.restTemplate.getForEntity(url, City.class);
        System.out.println(response);
        assertAll(() -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody()));

    }

    @Test
    void delete() {
        String url = baseUrl + "delete/" + this.city.getId();
        this.restTemplate.delete(url);
    }
}