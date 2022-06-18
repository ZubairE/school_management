/*Author:
Ismail Watara
Student_Number: 219018790
Date: 18 June 2022
IEmployeeServcice.java
 */


package za.ac.cput.schoolmanagement.service.entity;

import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;
import java.util.Optional;




public interface IEmployeeService extends IService<Employee, String> {

    void deleteById(String id);

    Employee save(Employee employee);
    Optional<Employee> read(String id);
    List<Employee> findAll();
    Optional<Employee> findByEmail(String email);
    List<Employee> getAll();

}
