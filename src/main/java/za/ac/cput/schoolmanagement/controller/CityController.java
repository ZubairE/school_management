/**
 * CityController.java
 * City Controller class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 18 June 2022
 */

package za.ac.cput.schoolmanagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.api.CityAPI;
import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.service.entity.CityService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/city/")
@Slf4j
public class CityController {

    private final CityAPI api;
    private final CityService cityService;

    @Autowired
    public CityController(CityAPI api, CityService cityService){
        this.api = api;
        this.cityService = cityService;
    }

    @PostMapping("save")
    public ResponseEntity<City> save(@RequestBody City city) {
        log.info("Save: {}",city);
        city = cityService.save(city);
        return ResponseEntity.ok(city);
    }

    private Optional<City> getById(String id){
        return this.cityService.read(id);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<City> read(@PathVariable String id){
        log.info("Reading: {}",id);
        City city = getById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(city);
    }

    @DeleteMapping("delete/{unitNumber}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        log.info("Reading: {}",id);
        Optional<City> city = getById(id);
        if (city.isPresent()){
            this.cityService.delete(city.get());
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<City>> findAll(){
        List<City> city = this.cityService.findByCity();
        return ResponseEntity.ok(city);
    }
}

