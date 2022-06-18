package za.ac.cput.schoolmanagement.api;
/* StudentAddressAPI.java
   Student address API class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.schoolmanagement.domain.entity.StudentAddress;
import za.ac.cput.schoolmanagement.service.entity.StudentAddressService;

@Component
public class StudentAddressAPI {
    private final StudentAddressService studentAddressService;

    @Autowired
    public StudentAddressAPI(StudentAddressService studentAddressService) {
        this.studentAddressService = studentAddressService;
    }

    public StudentAddress save(StudentAddress studentAddress) {

        return this.studentAddressService.save(studentAddress);


    }
}
