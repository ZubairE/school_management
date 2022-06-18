package za.ac.cput.schoolmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.schoolmanagement.api.EmployeeAddressAPI;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;

@RestController
@RequestMapping("school/employee-address/")
public class EmployeeAddressController {

    private final EmployeeAddressAPI api;

    @Autowired public EmployeeAddressController(EmployeeAddressAPI api) {
        this.api = api;
    }

    @PostMapping("save")
    public ResponseEntity<EmployeeAddress> save(@RequestBody @Validated EmployeeAddress employeeAddress){
     EmployeeAddress saved = this.api.save(employeeAddress);
     return ResponseEntity.ok(saved);
    }

}
