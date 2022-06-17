package za.ac.cput.schoolmanagement.factory.entityfactory;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest {

    @Test public void build(){
        Country country = CountryFactory.build("87", "South Africa");
        System.out.println(country);
        assertNotNull(country);
    }

}