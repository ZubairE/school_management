package za.ac.cput.schoolmanagement.service.entity;

import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService extends IService<Employee, String > {

    public List<Employee> findAll();
    List<Employee> findByStaffId(String staffId);
    Optional<Employee> findEmployeeFirstNameByEmail(String email);

    boolean existsByEmail (String email);

    boolean existsByStaffId(String staffId);

    }