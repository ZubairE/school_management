package za.ac.cput.schoolmanagement.controller;
/* StudentAddressController.java
   Student address controller class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.domain.entity.StudentAddress;
import za.ac.cput.schoolmanagement.service.entity.StudentAddressService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/student-address/")
public class StudentAddressController {
    private final StudentAddressService studentAddressService;

    @Autowired public StudentAddressController(StudentAddressService studentAddressService){
        this.studentAddressService = studentAddressService;
    }

    @PostMapping("save")
    public ResponseEntity<StudentAddress> save(@RequestBody StudentAddress studentAddress){
        StudentAddress save = studentAddressService.save(studentAddress);
        return ResponseEntity.ok(save);

    }

    @GetMapping("read/{id}")
    public ResponseEntity<StudentAddress> read(@PathVariable("id") StudentAddress.StudentSpecAddress address){
        StudentAddress studentAddress = this.studentAddressService.read(address)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Student address not found"));
        return ResponseEntity.ok(studentAddress);

    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable StudentAddress.StudentSpecAddress id){
        Optional<StudentAddress> studentAddress = this.studentAddressService.read(id);
        if (studentAddress.isPresent()) {
            this.studentAddressService.delete(studentAddress.get());
        }
        return ResponseEntity.noContent().build();

    }
    @GetMapping("search")
    public ResponseEntity<List<StudentAddress>> findByStudentId(String studentId){
        List<StudentAddress> studentAddress = this.studentAddressService.findByStudentAddressId(studentId);
        return ResponseEntity.ok(studentAddress);

    }
}
