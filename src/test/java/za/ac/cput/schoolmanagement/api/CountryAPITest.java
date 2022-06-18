/**
 * CountryAPITest.java
 * Country API Test class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 18 June 2022
 */

package za.ac.cput.schoolmanagement.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.factory.entityfactory.CountryFactory;
import za.ac.cput.schoolmanagement.service.entity.CountryService;

@SpringBootTest
class CountryAPITest {
    @Autowired private CountryService countryService;

    @Autowired private CountryAPI api;
    private Country country = CountryFactory.build("id", "name");
    @Test
    void save() {
        Country saved = this.api.save(this.country);
    }
}