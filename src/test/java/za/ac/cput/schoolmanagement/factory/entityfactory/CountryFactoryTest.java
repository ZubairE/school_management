package za.ac.cput.schoolmanagement.factory.entityfactory;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest {

    @Test
    public void build() {
        Country country = CountryFactory.build("87", "South Africa");
        System.out.println(country);
        assertNotNull(country);
    }

    @Test
    public void buildWithError() {

        Exception e1 = assertThrows(IllegalArgumentException.class, () ->
                CountryFactory.build(null, "South Africa"));
        String exceptionMessage = e1.getMessage();
        System.out.println(exceptionMessage);
        assertSame("id is required", exceptionMessage);

        Exception e2 = assertThrows(IllegalArgumentException.class, () ->
                CountryFactory.build("87", null));
        String exceptionMessage2 = e2.getMessage();
        System.out.println(exceptionMessage2);
        assertSame("name is required", exceptionMessage2);
    }
}