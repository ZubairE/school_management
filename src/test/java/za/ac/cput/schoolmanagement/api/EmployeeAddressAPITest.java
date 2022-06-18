package za.ac.cput.schoolmanagement.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;
import za.ac.cput.schoolmanagement.factory.EmployeeAddressFactory;
import za.ac.cput.schoolmanagement.service.entity.EmployeeAddressService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeAddressAPITest {

    @Autowired private EmployeeAddressService employeeAddressService;

    @Autowired private EmployeeAddressAPI api;

    private EmployeeAddress employeeAddress = EmployeeAddressFactory.build("staffId", "address");
    @Test
    void save() {
        EmployeeAddress saved = this.api.save(this.employeeAddress);
    }
}