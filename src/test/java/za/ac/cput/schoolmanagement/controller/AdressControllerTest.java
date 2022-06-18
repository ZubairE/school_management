
/*
AdressControllerTest.java
Class handling controller tests methods
Author : Zubair Esau (217100554)
Date 15 June 2022

 */



package za.ac.cput.schoolmanagement.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.factory.entityfactory.AdressFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AdressControllerTest {

    @LocalServerPort
    private int port;

    @Autowired private AdressController controller;
    @Autowired private TestRestTemplate restTemplate;

    private Adress adress;
    private String baseUrl ;

    @BeforeEach
    void setUp(){
        this.adress= AdressFactory
                .build("","","","", Integer.parseInt(""),"");
        this.baseUrl = "http://localhost:" + this.port + "/school/adress/";
    }


    @Test
    @Order(1)
    void save() {
        String url = baseUrl + "Save";
        System.out.println(url);
        ResponseEntity<Adress> response = this.restTemplate
                .postForEntity(url,this.adress,Adress.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );

    }

    @Test
    @Order(2)
    void read() {
        String url = baseUrl + "Read/"+ this.adress.getUnitNumber();
        System.out.println(url);
        ResponseEntity<Adress> response = this.restTemplate
                .getForEntity(url,Adress.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );


    }

    @Test
    @Order(3)
    void delete() {
        String url = baseUrl + "delete/"+this.adress.getUnitNumber();
        this.restTemplate.delete(url);


    }

    @Test
    @Order(4)
    void findAll() {
        String url = baseUrl + "all";
        System.out.println(url);
        ResponseEntity<Adress[]> response = this.restTemplate
                .getForEntity(url,Adress[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );



    }







}