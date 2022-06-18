package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress.EmployeeAddressId;
import za.ac.cput.schoolmanagement.factory.EmployeeAddressFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeAddressRepositoryImpl implements EmployeeAddressRepository{
    private final List<EmployeeAddress> employeeAddressList;
    private static EmployeeAddressRepositoryImpl EMPLOYEE_ADDRESS_REPOSITORY;

    private EmployeeAddressRepositoryImpl(){
        this.employeeAddressList = new ArrayList<>();
    }

    public static EmployeeAddressRepositoryImpl getRepository(){
        if (EMPLOYEE_ADDRESS_REPOSITORY == null)
            EMPLOYEE_ADDRESS_REPOSITORY = new EmployeeAddressRepositoryImpl();
        return EMPLOYEE_ADDRESS_REPOSITORY;
    }
    public EmployeeAddress save(EmployeeAddress employeeAddress){
        EmployeeAddress.EmployeeAddressId employeeAddressId = EmployeeAddressFactory.buildId(employeeAddress);
        new EmployeeAddressId(employeeAddress.getStaffId());
        Optional<EmployeeAddress>read = read(employeeAddressId);
        if(read.isPresent()){
            delete(read.get());
        }
        this.employeeAddressList.add(employeeAddress);
        return employeeAddress;
    }
    public Optional<EmployeeAddress> read(EmployeeAddressId employeeAddressId){
        return this.employeeAddressList.stream().filter(g->g.getStaffId().equalsIgnoreCase(employeeAddressId.getStaffId())).findFirst();
    }
    public void delete(EmployeeAddress employeeAddress){
        this.employeeAddressList.remove(employeeAddress);
    }
    public List<EmployeeAddress>findByStaffId(String staffId){
        return this.employeeAddressList.stream().filter(g->g.getStaffId().equalsIgnoreCase(staffId)).collect(Collectors.toList());
    }
}
