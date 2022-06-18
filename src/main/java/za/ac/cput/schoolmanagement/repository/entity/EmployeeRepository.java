/*
Author:Ismail Watara
Student_Number: 219018790
Date: 18 June 2022
EmployeeRepository.java
*/
package za.ac.cput.schoolmanagement.repository.entity;
import za.ac.cput.schoolmanagement.domain.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class EmployeeRepository {

    private final List<Employee> employeeList;
    private static EmployeeRepository EMPLOYEE_REPOSITORY;

    private EmployeeRepository() {
        this.employeeList = new ArrayList<>();
    }

    public static EmployeeRepository getRepository(){
        if (EMPLOYEE_REPOSITORY == null) {
            EMPLOYEE_REPOSITORY = new EmployeeRepository();
        }
        return EMPLOYEE_REPOSITORY;
    }

    public Employee save (Employee employee) {
        Optional<Employee> read =
                read(employee.getStaffId());
        if(read.isPresent()){delete(read.get());
        }
        this.employeeList.add(employee);
        return employee;
    }
    public Optional<Employee>
    read(String staffId) {
        return this.employeeList.stream().filter(g -> g.getStaffId().equalsIgnoreCase(staffId))
                .findFirst();
    }
    public void delete(Employee employee){
        this.employeeList.remove(employee);
    }
    public List<Employee> findAll() {
        return this.employeeList;
    }
    public List<Employee> findByStaffId(String staffId) {
        return this.employeeList.stream().filter(g -> g.getStaffId().equalsIgnoreCase(staffId))
                .collect(Collectors.toList());
    }

    public Optional<Employee>
    findEmployeeFirstNameByEmail(String email) {

        return this.employeeList.stream().filter(
                g -> g.getEmail().equalsIgnoreCase(email))
                .findFirst();

    }
    public boolean existsByEmail(String email)
    {

        return existsByEmail(email);
    }

    public boolean existsByStaffId(String staffId) {

        return existsByStaffId(staffId);
    }
}