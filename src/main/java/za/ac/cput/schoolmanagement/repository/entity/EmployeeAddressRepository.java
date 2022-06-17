package za.ac.cput.schoolmanagement.repository.entity;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;
import za.ac.cput.schoolmanagement.repository.IRepository;
import java.util.List;

public interface EmployeeAddressRepository extends IRepository<EmployeeAddress, EmployeeAddress.EmployeeAddressId> {
    List<EmployeeAddress>findByStaffId(String staffId);
}
