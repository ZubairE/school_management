package za.ac.cput.schoolmanagement.service.entity;

import org.junit.jupiter.api.Test;

import za.ac.cput.schoolmanagement.domain.entity.Adress;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AdressServiceTest {


    private Adress adress;
    private AdressService service;
    private String unitNumber;



    @Test
    void read() {
        Optional<Adress> read = this.service.read(this.unitNumber);
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(this.adress, read.get())
        );
    }


}