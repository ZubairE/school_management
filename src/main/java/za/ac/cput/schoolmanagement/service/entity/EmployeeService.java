package za.ac.cput.schoolmanagement.service.entity;

import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.repository.entity.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeService implements IEmployeeService {
    private final EmployeeRepository repository;
    private static IEmployeeService SERVICE ;

    private EmployeeService(){
        this.repository = EmployeeRepository.getRepository();

    }

    public static EmployeeService getService()
    {
        if(SERVICE == null)
            SERVICE = new EmployeeService();
        return (EmployeeService) SERVICE;
    }

    @Override

    public Employee save(Employee employee)
    {
        return this.repository.save(employee);
    }

    @Override


    public Optional<Employee> read(String s)
    {
        return this.repository.read(s);
    }

    @Override
    public void delete(Employee employee)
    {
        this.repository.delete(employee);
    }


    @Override


    public List<Employee> findAll() {
        return this.repository.findAll();

    }

    @Override


    public List<Employee> findByStaffId(String staffId) {
        return this.repository.findByStaffId(staffId);

    }
    @Override

    public Optional<Employee> findEmployeeFirstNameByEmail(String email) {
        return this.repository.findEmployeeFirstNameByEmail(email);

    }

    @Override

    public boolean existsByEmail(String email) {
        return this.repository.existsByEmail(email);
    }

    @Override

    public boolean existsByStaffId(String staffId) {
        return this.repository.existsByStaffId(staffId);
    }
}