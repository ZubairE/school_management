package za.ac.cput.schoolmanagement.repository.entity;


import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountryRepository implements IRepository<Country, String> {
    private final List<Country> countryList;
    private static CountryRepository COUNTRY_REPOSITORY;

    private CountryRepository() {
        this.countryList = new ArrayList<>();
    }

    public static CountryRepository getCountryRepository() {
        if (COUNTRY_REPOSITORY == null)
            COUNTRY_REPOSITORY = new CountryRepository();
        return COUNTRY_REPOSITORY;
    }


    public Optional<Country> read(String id, String name) {
        return this.countryList.stream().filter(c -> c.getId().equalsIgnoreCase(id))
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public void delete(Country id) {
        this.countryList.remove(id);
    }

    public List<Country> findAll() {
        return this.countryList;
    }
}