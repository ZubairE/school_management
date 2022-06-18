package za.ac.cput.schoolmanagement.service.entity;
import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;
import za.ac.cput.schoolmanagement.repository.entity.EmployeeAddressRepository;
import za.ac.cput.schoolmanagement.repository.entity.EmployeeAddressRepositoryImpl;
import za.ac.cput.schoolmanagement.service.entity.EmployeeAddressService;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeAddressServiceImpl implements EmployeeAddressService {
    private static EmployeeAddressServiceImpl SERVICE;
    private final EmployeeAddressRepository repository;

    private EmployeeAddressServiceImpl(){
        this.repository = EmployeeAddressRepositoryImpl.getRepository();
    }
    public static EmployeeAddressService getService(){
        if (SERVICE == null)
            SERVICE = new EmployeeAddressServiceImpl();
        return SERVICE;
    }

    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress){
        return this.repository.save(employeeAddress);
    }
    @Override
    public Optional<EmployeeAddress>read(EmployeeAddress.EmployeeAddressId employeeAddressId){
        return this.repository.read(employeeAddressId);
    }
    @Override
    public void delete(EmployeeAddress employeeAddress){
        this.repository.delete(employeeAddress);
    }
    @Override
    public List<EmployeeAddress>findByStaffId(String staffId){
        return this.repository.findByStaffId(staffId);
    }
}
