/*
 *NameRepositoryTest.java
 * VuyolwethuKalolo
 * 214015637
 * 18-06-2022
 */

package za.ac.cput.schoolmanagement.repository.entity;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.factory.entityfactory.NameFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NameRepositoryTest {
    private Name name;
    private NameRepository repository ;

    @BeforeEach void setUp(){
        this.name= NameFactory.build("","","");
        //this.repository=NameRepository.nameRepository();
        Name saved=this.repository.save(this.name);
       assertSame(this.name,saved);
    }
    @AfterEach void TearDown() {
        this.repository.delete(this.name);
    }


    @Test
    void read() {
        Name saved=this.repository.save(this.name);
   // Optional<Name> read =this.repository.read(saved.getMiddleName());



    }

    @Test
    void delete() {
        Name saved=this.repository.save(this.name);
        this.repository.delete(this.name);
        //List<Name>nameList =this.repository.findA();
        //assertEquals(0, nameList.size());
    }

    @Test
    void findAll() {
        this.repository.save(this.name);
      //  List <Name> nameList=this.repository.findAll();
        //assertEquals(1,nameList);
    }
}