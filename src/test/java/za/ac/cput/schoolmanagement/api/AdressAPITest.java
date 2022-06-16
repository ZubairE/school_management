package za.ac.cput.schoolmanagement.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.factory.entityfactory.AdressFactory;
import za.ac.cput.schoolmanagement.service.entity.AdressService;

import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest
class AdressAPITest {

   @Autowired private AdressService adressService;
    @Autowired private AdressAPI api;

    private Adress adress = AdressFactory
            .build("","","","", Integer.parseInt(""),"");


    @Test
    void save(){
         Adress saved = this.api.save(this.adress);
    }





}