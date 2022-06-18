/**
 * CountryAPI.java
 * Country API class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 18 June 2022
 */

package za.ac.cput.schoolmanagement.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.service.entity.CountryService;

import java.util.Optional;

@Component
public class CountryAPI {
    private final CountryService countryService;

    @Autowired
    public CountryAPI(CountryService countryService){
        this.countryService = countryService;
    }

    public Country save(Country country){
        Optional<Country> read = this.countryService.read(country.getId());
        if (read.isPresent()){
            return  this.countryService.save(country);
        }

        return null;
    }
}
