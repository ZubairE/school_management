package za.ac.cput.schoolmanagement.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;
import za.ac.cput.schoolmanagement.service.entity.EmployeeAddressService;

import java.util.Optional;

@Component
public class EmployeeAddressAPI {

    private final EmployeeAddressService employeeAddressService;

    @Autowired public EmployeeAddressAPI(EmployeeAddressService employeeAddressService) {
        this.employeeAddressService = employeeAddressService;
    }

    public EmployeeAddress save(EmployeeAddress employeeAddress) {

        return this.employeeAddressService.save(employeeAddress);


    }

}
