/**
 * CityAPITest.java
 * City API Test class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 18 June 2022
 */

package za.ac.cput.schoolmanagement.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.factory.entityfactory.CityFactory;
import za.ac.cput.schoolmanagement.service.entity.CityService;

@SpringBootTest
class CityAPITest {
    @Autowired private CityService cityService;

    @Autowired private CityAPI api;
    private City city = CityFactory.build("id", "name","country");
    @Test
    void save() {
        City saved = this.api.save(this.city);
    }
}