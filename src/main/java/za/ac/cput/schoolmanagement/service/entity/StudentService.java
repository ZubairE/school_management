package za.ac.cput.schoolmanagement.service.entity;
/* StudentService.java
   Student service class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;

public interface StudentService extends IService<Student, Student.StudentMainId> {
    List<Student> findByStudentAddressId(String studentId);
}
