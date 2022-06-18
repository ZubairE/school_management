/**
 * CityRepositoryTest.java
 * City Repository Test class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.repository.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.factory.entityfactory.CityFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CityRepositoryTest{
    private City city;
    private CityRepository repository;

    @BeforeEach void setUp(){
        this.city = CityFactory.build("test id", "test city", "test country");
        this.repository = CityRepository.cityRepository();
        City saved = this.repository.save(this.city);
        assertSame(this.city, saved);
    }

    @AfterEach void tearDown(){
        this.repository.delete(this.city);
        List<City> cityList = this.repository.findAll();
        assertEquals(0, cityList.size());
    }

    @Test
    void read(){
        Optional<City> read = this.repository.read(this.city.getId());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.city, read.get())
        );
    }

    @Test
    void findAll(){
        List<City> countryList = this.repository.findAll();
        assertEquals(1, countryList.size());
    }
}