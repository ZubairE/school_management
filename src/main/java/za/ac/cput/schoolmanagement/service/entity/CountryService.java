package za.ac.cput.schoolmanagement.service.entity;

import java.util.Optional;
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.repository.entity.CountryRepository;
import za.ac.cput.schoolmanagement.service.entity.ICountryService;

public class CountryService implements ICountryService {
//    private final CountryRepository repository;
//
//    private CountryService (){
//        this.repository =
//    }

    @Override
    public Country save(Country country){
        return null;
    }

    @Override
    public Optional<Country> read(String s){
        return Optional.empty();
    }

    @Override
    public void delete(Country country){

    }
}
