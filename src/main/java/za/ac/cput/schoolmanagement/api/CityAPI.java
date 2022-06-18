package za.ac.cput.schoolmanagement.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.service.entity.CityService;

import java.util.Optional;

@Component
public class CityAPI {
    private final CityService cityService;

    @Autowired
    public CityAPI(CityService cityService){
        this.cityService = cityService;
    }

    public City save(City city){
        Optional<City> read = this.cityService.read(city.getId());
        if (read.isPresent()){
            return  this.cityService.save(city);
        }

        return null;
    }
}

