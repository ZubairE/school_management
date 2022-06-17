package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CityRepository implements IRepository<City, String>{
    private final List<City> cityList;
    private static CityRepository CITY_REPOSITORY;

    private CityRepository() {
        this.cityList = new ArrayList<>();
    }

    public static CityRepository cityRepository() {
        if (CITY_REPOSITORY == null)
            CITY_REPOSITORY = new CityRepository();
        return CITY_REPOSITORY;
    }

    public City save(City city) {
        Optional<City> read = read(city.getId(), city.getName(), city.getCountry());
        if (read.isPresent()) {
            delete(read.get());
        }
        this.cityList.add(city);
        return city;
    }

    public Optional<City> read(String id, String name, String country) {
        return this.cityList.stream().filter(c -> c.getId().equalsIgnoreCase(id))
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .filter(c -> c.getCountry().equalsIgnoreCase(country))
                .findFirst();
    }

    public void delete(City city) {
        this.cityList.remove(city);
    }

    public List<City> findAll() {
        return this.cityList;
    }
}