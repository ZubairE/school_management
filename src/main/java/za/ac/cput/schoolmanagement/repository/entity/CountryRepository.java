/**
 * CountryRepository.java
 * Country Repository class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.repository.entity;


import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CountryRepository implements ICountryRepository {
    private final List<Country> countryList;

    private CountryRepository() {
        this.countryList = new ArrayList<>();
    }


    public Country save(Country country) {
        Optional<Country> read = read(country.getId());
        if (read.isPresent()) {
            delete(read.get());
        }
        this.countryList.add(country);
        return country;
    }

    @Override
    public Optional<Country> read(String s) {
        return Optional.empty();
    }

    public Optional<Country> read(Country.CountryName countryName) {
        return this.countryList.stream()
                .filter(c -> c.getId().equalsIgnoreCase(countryName.getCountry()))
                .findFirst();
    }

    public void delete(Country id) {
        this.countryList.remove(id);
    }

    @Override
    public List<Country> findByCountry() {
        return null;
    }
}