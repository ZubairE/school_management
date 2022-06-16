package za.ac.cput.schoolmanagement.domain.entity;
/* StudentAddress.java
   Student address class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import java.util.Objects;

public class StudentAddress {
    private final String studentId, address;

    //Private constructor required
    private StudentAddress(Builder builder){
        this.studentId = builder.studentId;
        this.address = builder.address;

    }

    public String getStudentId() {
        return studentId;
    }

    public String getAddress() {
        return address;
    }
    public static class Builder{
        private String studentId, address;

        public Builder studentId(String studentId){
            this.studentId = studentId;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder copy(StudentAddress studentAddress){
            this.studentId = studentAddress.studentId;
            this.address = studentAddress.address;
            return this;
        }
        public StudentAddress build(){return new StudentAddress(this);}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return studentId.equals(builder.studentId) && address.equals(builder.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentId, address);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "studentId='" + studentId + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}
