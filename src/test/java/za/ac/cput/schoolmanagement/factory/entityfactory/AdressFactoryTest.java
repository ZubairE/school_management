package za.ac.cput.schoolmanagement.factory.entityfactory;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.schoolmanagement.domain.entity.Adress;


@SpringBootTest
public class AdressFactoryTest extends TestCase {


    @Test
    public void build(){
        Adress adress = AdressFactory.build("","","","", Integer.parseInt(""),"");
        System.out.println(adress);
        assertNotNull(adress);

    }
}


