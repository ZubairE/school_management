/*
Author:Ismail Watara
Student_Number: 219018790
Date: 18 June 2022
IEmployeeRepository.java
*/
package za.ac.cput.schoolmanagement.repository.entity;
import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.repository.IRepository;
import java.util.List;
import java.util.Optional;


public interface IEmployeeRepository extends IRepository<Employee, String> {
        List<Employee> findByEmployeeId (String staffId);


    List<Employee> findAll();

    Optional<Employee> findById(String staffId);

    Optional<Employee> findByEmail(String email);

    void deleteById(String id);
}
