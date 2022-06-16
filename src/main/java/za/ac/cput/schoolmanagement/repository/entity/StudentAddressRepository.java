package za.ac.cput.schoolmanagement.repository.entity;
/* StudentAddressRepository.java
   Student address repository class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.domain.entity.StudentAddress;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.List;

public interface StudentAddressRepository extends IRepository<StudentAddress, StudentAddress.StudentSpecAddress> {
    List<StudentAddress> findByStudentId (String address);
}

