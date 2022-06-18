package za.ac.cput.schoolmanagement.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.factory.entityfactory.NameFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class NameControllerTest {
    @LocalServerPort
    private int port;
    @Autowired private NameController controller;
    @Autowired private TestRestTemplate restTemplate;
    private Name name;
    private String baseUrl;

    NameControllerTest(NameController controller) {
        this.controller = controller;
    }

    @BeforeEach
    void SetUp(){
        assertNotNull(controller);
      //  this.name= NameFactory.build("yuri","");
      //  this.baseUrl="http://localhost" this.port + " schoolmanagement/name-type/";
    }
    @Test
    void save() {

    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }
}