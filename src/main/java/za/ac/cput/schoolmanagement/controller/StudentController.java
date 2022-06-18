package za.ac.cput.schoolmanagement.controller;
/* StudentController.java
   Student controller class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.service.entity.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/student/")
public class StudentController {
    private final StudentService studentService;

    @Autowired public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("save")
    public ResponseEntity<Student> save(@RequestBody Student student){
        Student save = studentService.save(student);
        return ResponseEntity.ok(save);

    }
    @GetMapping("read/{ID}")
    public ResponseEntity<Student> read(@PathVariable("i")Student.StudentMainId studentId){
        Student student = this.studentService.read(studentId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Student details not found"));
        return ResponseEntity.ok(student);

    }
    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(Student details){
        this.studentService.delete(details);
        return ResponseEntity.noContent().build();

    }
    @GetMapping("search")
    public List<Student> findByStudentId(String studentId){
        return this.studentService.findByStudentAddressId(studentId);

    }
}
