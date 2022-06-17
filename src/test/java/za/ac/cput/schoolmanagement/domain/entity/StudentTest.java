package za.ac.cput.schoolmanagement.domain.entity;
/* StudentTest.java
   Student test class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.factory.entityfactory.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void success(){
        Student student = StudentFactory
                .build("219013252", "chadrackmbuyi2@gmail.com", "Chad Smith");
        System.out.println(student);
        assertNotNull(student);
    }
    @Test
    public void unsuccess(){
        Exception exception = assertThrows(IllegalArgumentException.class,() ->{
            StudentFactory.build(null, "chadrackmbuyi2@gmail.com","Chad Smith");
        });
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Student ID is required", exceptionMessage);
    }

}