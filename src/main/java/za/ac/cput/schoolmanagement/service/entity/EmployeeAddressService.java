package za.ac.cput.schoolmanagement.service.entity;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;
import za.ac.cput.schoolmanagement.service.IService;
import java.util.List;

public interface EmployeeAddressService extends IService<EmployeeAddress, EmployeeAddress.EmployeeAddressId>{
    List<EmployeeAddress>findByStaffId(String staffId);
}
