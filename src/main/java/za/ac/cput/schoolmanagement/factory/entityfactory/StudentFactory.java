package za.ac.cput.schoolmanagement.factory.entityfactory;
/* StudentFactory.java
   This is the Student factory class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import za.ac.cput.schoolmanagement.domain.entity.Student;
import za.ac.cput.schoolmanagement.helper.HelpStrings;

public class StudentFactory {
    public static Student build(String studentId, String email, String name){
        HelpStrings.checkStringParam("studentId", studentId);
        HelpStrings.checkStringParam("email", email);
        HelpStrings.checkStringParam("name", name);
        return new Student.Builder().studentId(studentId).email(email).name(name).build();
    }

    public static Student.StudentMainId build(Student student) {
        return new Student.StudentMainId(student.getStudentId(), student.getEmail());
    }
}
