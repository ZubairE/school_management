/**
 * CityRepository.java
 * City Repository class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CityRepository implements ICityRepository{
    private final List<City> cityList;

    private CityRepository() {
        this.cityList = new ArrayList<>();
    }

    public City save(City city) {
        Optional<City> read = read(city.getId());
        if (read.isPresent()) {
            delete(read.get());
        }
        this.cityList.add(city);
        return city;
    }

    @Override
    public Optional<City> read(String s) {
        return Optional.empty();
    }

//    public Optional<City> read(City.CityName cityName) {
//        return this.cityList.stream().filter(c -> c.getId().equalsIgnoreCase(cityName.getCity()))
//                .findFirst();
//    }

    public void delete(City city) {
        this.cityList.remove(city);
    }

    public List<City> findAll() {
        return this.cityList;
    }
}