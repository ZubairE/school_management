package za.ac.cput.schoolmanagement.api;
/* StudentAPI.java
   Student API class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.service.entity.StudentService;

@Component
public class StudentAPI {
    private final StudentService studentService;

    @Autowired
    public StudentAPI(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student save(Student student) {

        return this.studentService.save(student);


    }
}
