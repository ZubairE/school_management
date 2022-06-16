package za.ac.cput.schoolmanagement.factory.entityfactory;
/* StudentAddressFactory.java
   This is the Student address factory class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import za.ac.cput.schoolmanagement.domain.entity.StudentAddress;
import za.ac.cput.schoolmanagement.helper.HelpStrings;

public class StudentAddressFactory {
    public static StudentAddress build(String studentId, String address){
        HelpStrings.checkStringParam("studentId", studentId);
        HelpStrings.checkStringParam("address", address);
        return new StudentAddress.Builder().studentId(studentId).address(address).build();
    }
}
