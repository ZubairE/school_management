package za.ac.cput.schoolmanagement.factory;
import za.ac.cput.schoolmanagement.domain.entity.EmployeeAddress;
import za.ac.cput.schoolmanagement.helper.HelpStrings;


public class EmployeeAddressFactory {
    public static EmployeeAddress build(String staffId, String address){
        HelpStrings.checkStringParam("staffId", staffId);
        HelpStrings.checkStringParam("address", address);
        return new EmployeeAddress.Builder().staffId(staffId).address(address).build();
    }

    public static EmployeeAddress.EmployeeAddressId buildId(EmployeeAddress employeeAddress) {
        return new EmployeeAddress.EmployeeAddressId(employeeAddress.getStaffId());
    }
}