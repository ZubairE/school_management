package za.ac.cput.schoolmanagement.controller;
/* StudentController.java
   Student controller class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.service.entity.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("save")
    public Student save(Student student){
        return studentService.save(student);

    }

    public Optional<Student> read(Student.StudentMainId studentMainId){
        return studentService.read(studentMainId);

    }

    public void delete(Student details){
        this.studentService.delete(details);

    }

    public List<Student> findByStudentId(String studentId){
        return this.studentService.findByStudentAddressId(studentId);

    }
}
