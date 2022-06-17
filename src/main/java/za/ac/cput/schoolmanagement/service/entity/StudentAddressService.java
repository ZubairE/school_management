package za.ac.cput.schoolmanagement.service.entity;
/* StudentAddressService.java
   Student address service class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import za.ac.cput.schoolmanagement.domain.entity.StudentAddress;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;

public interface StudentAddressService extends IService<StudentAddress, StudentAddress.StudentSpecAddress> {
    List<StudentAddress> findByStudentAddressId(String studentId);
}
