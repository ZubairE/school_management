package za.ac.cput.schoolmanagement.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.api.AdressAPI;
import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.service.entity.AdressService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/adress/")
@Slf4j
public class AdressController {

     private final AdressAPI api;
    private final AdressService adressService;

    @Autowired
    public AdressController(AdressAPI api, AdressService adressService) {
        this.api = api;
        this.adressService = adressService;
    }

    //   @Autowired public AdressController(AdressService adressService){
   //      this.adressService = adressService;
   ///  }


    @PostMapping("save")
    public ResponseEntity<Adress> save(@RequestBody Adress adress){
         log.info("Save: {}",adress);
         Adress address = adressService.save(adress);
        return ResponseEntity.ok(address);
    }


    private Optional<Adress> getById(String unitNumber){
         return this.adressService.read(unitNumber);
    }

    @GetMapping("read/{unitNumber}")
    public ResponseEntity<Adress> read(@PathVariable String unitNumber){
         log.info("Reading request: {}",unitNumber);
                   Adress adress = getById(unitNumber)
                           .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND)); //ZUBAIR REMINDER TO ADD SMTHG!!
                   return ResponseEntity.ok(adress);
    }

    @DeleteMapping("delete/{unitNumber}")
    public ResponseEntity<Void> delete(@PathVariable String unitNumber){
         log.info("Reading request: {}",unitNumber);
        Optional<Adress> adress  = getById(unitNumber);
        if (adress.isPresent()){
            this.adressService.delete(adress.get());
        }
         return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Adress>> findAll(){
         List<Adress> adress = this.adressService.findAll();
         return ResponseEntity.ok(adress);
    }



}
