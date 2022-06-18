package za.ac.cput.schoolmanagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.api.CountryAPI;
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.service.entity.CountryService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/country/")
@Slf4j
public class CountryController {

    private final CountryAPI api;
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryAPI api, CountryService countryService){
        this.api = api;
        this.countryService = countryService;
    }

    @PostMapping("save")
    public ResponseEntity<Country> save(@RequestBody Country country) {
        log.info("Save: {}",country);
        country = countryService.save(country);
        return ResponseEntity.ok(country);
    }

    private Optional<Country> getById(String id){
        return this.countryService.read(id);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<Country> read(@PathVariable String id){
        log.info("Reading: {}",id);
        Country country = getById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(country);
    }

    @DeleteMapping("delete/{unitNumber}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        log.info("Reading: {}",id);
        Optional<Country> country = getById(id);
        if (country.isPresent()){
            this.countryService.delete(country.get());
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Country>> findAll(){
        List<Country> country = this.countryService.findByCountry();
        return ResponseEntity.ok(country);
    }
}
