/**
 * CountryRepository.java
 * Country Repository class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.repository.entity;


import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountryRepository implements ICountryRepository {
    private final List<Country> countryList;
    private static CountryRepository COUNTRY_REPOSITORY;

    private CountryRepository() {
        this.countryList = new ArrayList<>();
    }

    public static CountryRepository countryRepository() {
        if (COUNTRY_REPOSITORY == null)
            COUNTRY_REPOSITORY = new CountryRepository();
        return COUNTRY_REPOSITORY;
    }

    public Country save(Country country) {
        Optional<Country> read = read(country.getId());
        if (read.isPresent()) {
            delete(read.get());
        }
        this.countryList.add(country);
        return country;
    }

    public Optional<Country> read(String id) {
        return this.countryList.stream()
                .filter(c -> c.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    public void delete(Country id) {
        this.countryList.remove(id);
    }

    public List<Country> findAll() {
        return this.countryList;
    }
}