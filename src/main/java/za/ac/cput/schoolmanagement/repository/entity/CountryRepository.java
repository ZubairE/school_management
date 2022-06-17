package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.domain.entity.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountryRepository {
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
        Optional<Country> read = read(country.getId(), country.getName());
        if (read.isPresent()) {
            delete(read.get());
        }
        this.countryList.add(country);
        return country;
    }

    public Optional<Country> read(String id, String name) {
        return this.countryList.stream().filter(c -> c.getId().equalsIgnoreCase(id))
                .filter(city -> city.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public void delete(Country country) {
        this.countryList.remove(country);
    }

    public List<Country> findAll() {
        return this.countryList;
    }
}