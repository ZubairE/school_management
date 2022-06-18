package za.ac.cput.schoolmanagement.repository.entity.implSt;
/* StudentRepositoryImpl.java
   Student repository implementation class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.factory.entityfactory.StudentFactory;
import za.ac.cput.schoolmanagement.repository.entity.StudentAddressRepository;
import za.ac.cput.schoolmanagement.repository.entity.StudentRepository;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private final List<Student> studentList;

    private StudentRepositoryImpl(){
        this.studentList = new ArrayList<>();
    }

    public Student save(Student student){
        Student.StudentMainId studentMainId = StudentFactory.build(student);
        Optional<Student> read = read(studentMainId);
        if (read.isPresent()){
            delete(read.get());
        }
        this.studentList.add(student);
        return student;
    }

    public Optional<Student> read(Student.StudentMainId studentMainId){
        return this.studentList.stream().filter(g -> g.getStudentId().equalsIgnoreCase(studentMainId.getStudentId()))
                .filter(g ->g.getStudentId().equalsIgnoreCase(studentMainId.getEmail()))
                .findFirst();
    }
    //public Student update(Student student){
        //Optional<Student> read = read(student.getStudentId(), student.getEmail());
        //if(read.isPresent()){
        //    delete(read.get());
        //    save(student);
        //}
        //return student;
    //}
    public void delete(Student details){
        this.studentList.remove(details);
    }

    public List<Student> findByStudentId(String studentId) {
        return this.studentList.stream().filter(g -> g.getStudentId().equalsIgnoreCase(studentId))
                .collect(Collectors.toList());
    }
}
