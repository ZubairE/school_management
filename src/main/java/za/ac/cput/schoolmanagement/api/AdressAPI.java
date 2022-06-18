
/*
AdressAPI.java
Class for managing API methods for testing save
Author : Zubair Esau (217100554)
Date 16 June 2022

 */

package za.ac.cput.schoolmanagement.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.service.entity.AdressService;

import java.util.Optional;

@Component
public class AdressAPI {

    private final AdressService adressService;

    @Autowired
    public AdressAPI(AdressService adressService, AdressService adressService1) {
        //      this.adressService = adressService;
        ///  }
        this.adressService = adressService1;
    }


 public Adress save(Adress adress){
     Optional<Adress> read = this.adressService.read(adress.getUnitNumber());
     if (read.isPresent()){
         Optional<Adress> read1 = this.adressService.read(adress.getUnitNumber());
         if (read1.isPresent()){
           //  Adress Adress = null;
             return this.adressService.save(adress);
         }
     }

        return null;
 }




}