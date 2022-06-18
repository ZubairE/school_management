package za.ac.cput.schoolmanagement.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.factory.entityfactory.NameFactory;

import static org.junit.jupiter.api.Assertions.*;

class NameAPITest {
    @Autowired
    private Name nameService;

    @Autowired private NameAPI api;
    private Name name;

    //private Name name= NameFactory.build("name", "middlename");
    @Test
    void save() {
        Name saved = this.api.save(this.name);
    }
}