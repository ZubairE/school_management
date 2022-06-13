package za.ac.cput.schoolmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.service.entity.AdressService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/adress/")
public class AdressController {

     private final AdressService adressService;

     @Autowired public AdressController(AdressService adressService){
         this.adressService = adressService;
     }


    @PostMapping("save")
    public ResponseEntity<Adress> save(Adress adress){
        Adress address = adressService.save(adress);
        return ResponseEntity.ok(address);
    }

    @GetMapping("read/{unitNumber}")
    public ResponseEntity<Adress> read(@PathVariable String unitNumber){
                   Adress adress = this.adressService.read(unitNumber)
                           .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND)); //ZUBAIR REMINDER TO ADD SMTHG!!
                   return ResponseEntity.ok(adress);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(Adress adress){
         this.adressService.delete(adress);
         return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Adress>> findAll(){
         List<Adress> adress = this.adressService.findAll();
         return ResponseEntity.ok(adress);
    }



}
