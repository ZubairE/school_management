/*
Author:Ismail Watara
Student_Number: 219018790
Date: 10 June 2022
IEmployeeRepository.java
*/
package za.ac.cput.schoolmanagement.repository.entity;
import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


public interface IEmployeeRepository  extends JpaRepository<Employee, String> {



        public List<Employee> findAll();
        public List<Employee>findByStaffId(String staffId);

        Optional<Employee> findEmployeeFirstNameByEmail(String email);

        boolean existsByEmail (String email);
        boolean existsByStaffId(String staffId);


}