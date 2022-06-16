package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.domain.entity.StudentAddress;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.List;

public interface StudentAddressRepository extends IRepository<StudentAddress, StudentAddress.StudentSpecAddress> {
    List<StudentAddress> findByStudentId (String address);
}

