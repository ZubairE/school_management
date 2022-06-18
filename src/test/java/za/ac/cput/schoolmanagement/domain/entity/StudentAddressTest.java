package za.ac.cput.schoolmanagement.domain.entity;
/* StudentAddressTest.java
   Student address test class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.factory.entityfactory.StudentAddressFactory;


import static org.junit.jupiter.api.Assertions.*;

class StudentAddressTest {
    @Test
    public void test(){

        StudentAddress studentAddress = StudentAddressFactory.build(
                "2185496",
                "25 Chad road CAPE TOWN");


        System.out.println(studentAddress.toString());
        assertNotNull(studentAddress);
    }

}