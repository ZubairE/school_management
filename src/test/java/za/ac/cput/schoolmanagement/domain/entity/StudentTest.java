package za.ac.cput.schoolmanagement.domain.entity;
/* StudentTest.java
   Student test class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.factory.entityfactory.StudentAddressFactory;
import za.ac.cput.schoolmanagement.factory.entityfactory.StudentFactory;


import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void test(){

        Student student = StudentFactory.build(
                "2185496",
                "chadrackmbuyi@gmail.com","Chad Smith");


        System.out.println(student.toString());
        assertNotNull(student);
    }

}