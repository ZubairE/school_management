package za.ac.cput.schoolmanagement.controller;
/* StudentAddressController.java
   Student address controller class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.schoolmanagement.domain.entity.StudentAddress;
import za.ac.cput.schoolmanagement.service.entity.StudentAddressService;
import za.ac.cput.schoolmanagement.service.entity.implSt.StudentAddressServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/student-address")
public class StudentAddressController {
    private final StudentAddressService studentAddressService;

    @Autowired public StudentAddressController(StudentAddressService studentAddressService){
        this.studentAddressService = studentAddressService;
    }

    @PostMapping("save")
    public StudentAddress save(StudentAddress studentAddress){
        return studentAddressService.save(studentAddress);

    }

    public Optional<StudentAddress> read(StudentAddress.StudentSpecAddress studentSpecAddress){
        return studentAddressService.read(studentSpecAddress);

    }

    public void delete(StudentAddress addressDetails){
        this.studentAddressService.delete(addressDetails);
    }

    public List<StudentAddress> findByStudentId(String studentId){
        return this.studentAddressService.findByStudentAddressId(studentId);

    }
}
