package za.ac.cput.schoolmanagement.service.entity;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;
import za.ac.cput.schoolmanagement.factory.EmployeeAddressFactory;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Optional;

class EmployeeAddressServiceImpTest {
    private EmployeeAddress employeeAddress;
    private EmployeeAddress.EmployeeAddressId employeeAddressId;
    private EmployeeAddressService service;
@BeforeEach
    void setUp(String staffId){

    this.employeeAddress = EmployeeAddressFactory.build("staffId","address");
        this.employeeAddressId = EmployeeAddressFactory.buildId(this.employeeAddress);
        this.service = EmployeeAddressServiceImpl.getService();
        EmployeeAddress saved = this.service.save(this.employeeAddress);

        assertAll(()-> assertNotNull(saved), ()->assertEquals(this.employeeAddress, saved));

  }
  @AfterEach
    void tearDown(){
    this.service.delete(this.employeeAddress);
  }
  @Test
    void read(){
    Optional<EmployeeAddress>read = this.service.read(this.employeeAddressId);
    System.out.println(read);
    assertAll(()->assertTrue(read.isPresent()), ()->assertEquals(this.employeeAddress, read.get()));
  }
  @Test
    void findByStaffId(){
    String staffId = this.employeeAddressId.getStaffId();
    List<EmployeeAddress> employeeAddressList= (List<EmployeeAddress>) this.service.findByStaffId(staffId);
    System.out.println(employeeAddressList);
    assertSame(employeeAddressList.size());
  }

    private void assertSame(int size) {
    }

}