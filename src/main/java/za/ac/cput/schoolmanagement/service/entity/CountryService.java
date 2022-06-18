/**
 * CountryService.java
 * Country Service class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.service.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.repository.entity.CountryRepository;
import za.ac.cput.schoolmanagement.repository.entity.ICountryRepository;
import za.ac.cput.schoolmanagement.service.entity.ICountryService;

@Service
public class CountryService implements ICountryService {
    private final CountryRepository repository;

    public CountryService (CountryRepository repository){
        this.repository = repository;
    }


    @Override
    public Country save(Country country){
        return this.repository.save(country);
    }

    @Override
    public Optional<Country> read(String s){
        return this.repository.read(s);
    }

    @Override
    public void delete(Country country){
        this.repository.delete(country);
    }

//    @Override
//    public List<Adress> findAll(){
//        return (List<Country>) this.repository.findAll();
//    }
}
