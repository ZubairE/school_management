/*Author:Ismail Watara
        Student_Number: 219018790
        Date: 18 June 2022
        EmployeeServcice.java
*/
package za.ac.cput.schoolmanagement.service.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.repository.entity.IEmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service

public abstract class EmployeeServiceImpl implements IEmployeeService {

    private final IEmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(IEmployeeRepository repository){
        this.repository = repository;

    }

    @Override
    public Employee save(Employee employee) {
        return this.repository.save(employee);
    }



    @Override


    public Optional<Employee> read(String id) {
        return this.repository.findById(id);
    }

    @Override

    public void delete(Employee employee) {
        this.repository.delete(employee);
    }
    @Override

    public List<Employee> findAll() {
        return this.repository.findAll();
    }
    public void deleteById(String id) {
        repository.deleteById(id);
        Optional<Employee> employee = read(id);
        if (employee.isPresent()) {
            delete(employee.get());
        }
    }
    @Override

    public Optional<Employee> findByEmail(String email) {
        return this.repository.findByEmail(email);

    }


}