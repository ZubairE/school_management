/**
 * CityService.java
 * City Service class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.service.entity;

import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.repository.entity.CityRepository;

import java.util.Optional;

@Service
public class CityService implements ICityService{
    private final CityRepository repository;

    private CityService (CityRepository repository){
        this.repository = repository;
    }

    @Override
    public City save(City city){
        return this.repository.save(city);
    }

    @Override
    public Optional<City> read(String s){
        return this.repository.read(s);
    }

    @Override
    public void delete(City city){
        this.repository.delete(city);
    }
}

