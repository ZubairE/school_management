package za.ac.cput.schoolmanagement.domain.entity;
/* StudentAddressTest.java
   Student address test class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.factory.entityfactory.StudentAddressFactory;
import za.ac.cput.schoolmanagement.factory.entityfactory.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

class StudentAddressTest {
    @Test
    public void success(){
        StudentAddress studentAddress = StudentAddressFactory
                .build("219013252", "106 Mirabel Constittutionstress");
        System.out.println(studentAddress);
        assertNotNull(studentAddress);
    }
    @Test
    public void unsuccess(){
        Exception exception = assertThrows(IllegalArgumentException.class,() ->{
            StudentAddressFactory.build(null, "106 Mirabel Constittutionstress");
        });
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Student ID is required", exceptionMessage);
    }

}