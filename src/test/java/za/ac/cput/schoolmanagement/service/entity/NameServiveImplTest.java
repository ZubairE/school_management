package za.ac.cput.schoolmanagement.service.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.entity.Name;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NameServiveImplTest {

    private Name name;
    private NameService service;
    private String lastName, middleName;


    @Test
    void read() {
        Optional<Name> read = this.service.read(this.lastName);

        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.name, read.get())
        );
    }
}