package za.ac.cput.schoolmanagement.factory.entityfactory;
import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;
import za.ac.cput.schoolmanagement.domain.factory.entityfactory.EmployeeAddressFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeAddressFactoryTest{
    @Test public void build(){
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("", "");
        System.out.println(employeeAddress);
        assertNotNull(employeeAddress);
    }
}