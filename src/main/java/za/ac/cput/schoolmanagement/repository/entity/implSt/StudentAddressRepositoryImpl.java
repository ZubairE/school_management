package za.ac.cput.schoolmanagement.repository.entity.implSt;
/* StudentAddressRepositoryImpl.java
   Student address repository implementation class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.domain.entity.StudentAddress;
import za.ac.cput.schoolmanagement.factory.entityfactory.StudentAddressFactory;
import za.ac.cput.schoolmanagement.repository.entity.StudentAddressRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentAddressRepositoryImpl implements StudentAddressRepository {
    private final List<StudentAddress> studentAddressList;
    private static StudentAddressRepositoryImpl STUDENT_ADDRESS_REPOSITORY;

    private StudentAddressRepositoryImpl(){
        this.studentAddressList = new ArrayList<>();
    }
    public static StudentAddressRepositoryImpl studentAddressRepository(){
        if(STUDENT_ADDRESS_REPOSITORY == null)
            STUDENT_ADDRESS_REPOSITORY = new StudentAddressRepositoryImpl();
        return STUDENT_ADDRESS_REPOSITORY;
    }

    public StudentAddress save(StudentAddress studentAddress){
        StudentAddress.StudentSpecAddress studentSpecAddress = StudentAddressFactory.build(studentAddress);
        Optional<StudentAddress> read = read(studentSpecAddress);
        if (read.isPresent()){
            delete(read.get());
        }
        this.studentAddressList.add(studentAddress);
        return studentAddress;

    }
    public Optional<StudentAddress> read(StudentAddress.StudentSpecAddress studentSpecAddress){
        return this.studentAddressList.stream()
                .filter(g ->g.getAddress().equalsIgnoreCase(studentSpecAddress.getAddress()))
                .findFirst();
    }
    //public StudentAddress update(StudentAddress studentAddress){
        //check if employee identity exist, if yes, update and return if success
        //Optional<StudentAddress> read = read(studentAddress.getStudentId(), studentAddress.getAddress());
        //if (read.isPresent()){
        //    delete(read.get());
        //    save(studentAddress);
        //}
        //return studentAddress;
    //}
    public void delete(StudentAddress addressDetails){
        //find the employee identity if needed and delete
        this.studentAddressList.remove(addressDetails);

    }
    public List<StudentAddress> findByStudentId(String studentId) {
        return this.studentAddressList.stream().filter(g -> g.getStudentId().equalsIgnoreCase(studentId))
                .collect(Collectors.toList());
    }


}
