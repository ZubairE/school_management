package za.ac.cput.schoolmanagement.service.entity.implSt;
/* StudentAddressServiceImpl.java
   Student address service implementation class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.entity.StudentAddress;
import za.ac.cput.schoolmanagement.repository.entity.StudentAddressRepository;
import za.ac.cput.schoolmanagement.repository.entity.implSt.StudentAddressRepositoryImpl;
import za.ac.cput.schoolmanagement.service.entity.StudentAddressService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentAddressServiceImpl implements StudentAddressService{
    private final StudentAddressRepository repository;

    public StudentAddressServiceImpl(StudentAddressRepository repository){
        this.repository = repository;
    }

    public StudentAddress save(StudentAddress studentId){
        return this.repository.save(studentId);
    }

    public Optional<StudentAddress> read(StudentAddress.StudentSpecAddress address){
        return this.repository.read(address);

    }
     public void delete(StudentAddress studentAddress){
        this.repository.delete(studentAddress);
     }

     public List<StudentAddress> findByStudentAddressId(String studentId){
        return this.repository.findByStudentId(studentId);
     }
}
