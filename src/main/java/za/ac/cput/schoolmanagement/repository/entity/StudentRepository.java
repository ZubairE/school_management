package za.ac.cput.schoolmanagement.repository.entity;
/* StudentRepository.java
   Student repository class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.repository.IRepository;
import java.util.List;

public interface StudentRepository extends IRepository<Student, Student.StudentMainId> {
    List<Student> findByStudentId (String studentId);
}
