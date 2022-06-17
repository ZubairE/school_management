package za.ac.cput.schoolmanagement.factory.entityfactory;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.entity.City;

import static org.junit.jupiter.api.Assertions.*;

public class CityFactoryTest {


    @Test
    public void build() {
        City city = CityFactory.build("01", "Cape Town");
        System.out.println(city);
        assertNotNull(city);
    }

    @Test
    public void buildWithError() {

        Exception e1 = assertThrows(IllegalArgumentException.class, () -> CountryFactory.build(null, "Cape Town"));
        String exceptionMessage = e1.getMessage();
        System.out.println(exceptionMessage);
        assertSame("id is required", exceptionMessage);

        Exception e2 = assertThrows(IllegalArgumentException.class, () -> CountryFactory.build("01", null));
        String exceptionMessage2 = e2.getMessage();
        System.out.println(exceptionMessage2);
        assertSame("name is required", exceptionMessage2);
    }
}