package za.ac.cput.schoolmanagement.factory.entityfactory;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.entity.Name;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {

    @Test
    public void build() {
        Name name=NameFactory.build("","","");
        assertNotNull(name);
        System.out.println(name);
    }
    @Test
     void buildWithSuccess() {
        Name name=NameFactory.build("","","");

        System.out.println(name);
        assertAll(
                ()-> assertNotNull(name),
                ()->assertNotNull(name.getMiddleName())
        );
    }
}