/**
 * CountryRepositoryTest.java
 * Country Repository Test class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.repository.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.factory.entityfactory.CountryFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CountryRepositoryTest{
    private Country country;
    private CountryRepository repository;

    @BeforeEach void setUp(){
    this.country = CountryFactory.build("test id", "test country");
    this.repository = CountryRepository.countryRepository();
    Country saved = this.repository.save(this.country);
    assertSame(this.country, saved);
    }

    @AfterEach void tearDown(){
        this.repository.delete(this.country);
        List<Country> countryList = this.repository.findAll();
        assertEquals(0, countryList.size());
    }

    @Test
    void read(){
        Optional<Country> read = this.repository.read(this.country.getId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.country, read.get())
        );
    }

    @Test
    void findAll(){
        List<Country> countryList = this.repository.findAll();
        assertEquals(1, countryList.size());
    }
}