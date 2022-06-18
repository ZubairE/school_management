/**
 * CountryControllerTest.java
 * Country Controller Test class for School Management Assignment
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
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.factory.entityfactory.CountryFactory;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CountryControllerTest {

    @LocalServerPort
    private int port;

    @Autowired private CountryController countryController;
    @Autowired private TestRestTemplate restTemplate;

    private String baseUrl;
    private Country country;


    @BeforeEach
    void setUp() {
        assertNotNull(countryController);
        this.country = CountryFactory.build("","");
        this.baseUrl = "http://localhost:"+ this.port + "/schoolManagement/country/";
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<Country> response = this.restTemplate.postForEntity(url, this.country, Country.class);
        System.out.println(response);
        assertAll(()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
                ()-> assertNotNull(response.getBody())
        );
    }

    @Test
    void read() {
        String url = baseUrl+"read/" + this.country.getId();
        System.out.println(url);
        ResponseEntity<Country> response = this.restTemplate.getForEntity(url, Country.class);
        System.out.println(response);
        assertAll(()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
                ()-> assertNotNull(response.getBody()));

    }

    @Test
    void delete() {
        String url = baseUrl + "delete/" + this.country.getId();
        this.restTemplate.delete(url);
    }

//    @Test
//    void getAll() {
//        String url = baseUrl + "all";
//        System.out.println(url);
//        ResponseEntity<Employee[]> response = this.restTemplate.getForEntity(url,
//                Employee[].class);
//        System.out.println(Arrays.asList(response.getBody()));
//        assertAll(()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
//                ()-> assertTrue(response.getBody().length == 0));
//    }
}