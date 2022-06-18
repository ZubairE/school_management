package za.ac.cput.schoolmanagement.service.entity.implSt;
/* StudentServiceImpl.java
   Student service implementation class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.repository.entity.StudentRepository;
import za.ac.cput.schoolmanagement.repository.entity.implSt.StudentRepositoryImpl;
import za.ac.cput.schoolmanagement.service.entity.StudentService;

import java.util.List;
import java.util.Optional;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;
    private static StudentService SERVICE;

    public StudentServiceImpl(StudentRepository repository){
        this.repository = repository;
    }

    public Student save(Student studentId){
        return this.repository.save(studentId);
    }

    public Optional<Student> read(Student.StudentMainId studentId){
        return this.repository.read(studentId);
    }

    public void delete(Student student){
        this.repository.delete(student);
    }

    public List<Student> findByStudentId(String studentId){
        return this.repository.findByStudentId(studentId);
    }

    @Override
    public List<Student> findByStudentAddressId(String studentId) {
        return this.repository.findByStudentId(studentId);
    }
}
