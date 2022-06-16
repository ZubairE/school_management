package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.repository.IRepository;
import java.util.List;

public interface StudentRepository extends IRepository<Student, Student.StudentMainId> {
    List<Student> findByStudentId (String studentId);
}
