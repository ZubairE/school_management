package za.ac.cput.schoolmanagement.service.entity;

import java.util.Optional;
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.repository.entity.CountryRepository;
import za.ac.cput.schoolmanagement.service.entity.ICountryService;

public class CountryService implements ICountryService {
    private final CountryRepository repository;
    private static CountryService SERVICE;

    private CountryService (){
        this.repository = CountryRepository.countryRepository();
    }

    private static CountryService getService(){
        if (SERVICE == null)
            SERVICE = new CountryService();
        return SERVICE;
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
}
