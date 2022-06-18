/*
Author:Ismail Watara
Student_Number: 219018790
Date: 18 June 2022
Employee.java
*/


package za.ac.cput.schoolmanagement.domain.entity;

import lombok.NonNull;
import javax.lang.model.element.Name;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;


@Entity

public class Employee implements Serializable {

    @NonNull @Id
    private String staffId;
    @NonNull
    private String email;
    @NonNull
    private Name name;

    protected Employee(){}

    public Employee(Builder builder) {
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String getStaffId() {
        return staffId;}

    public void setStaffId(String staffId){
        this.staffId = staffId;}

    public String getEmail() {
        return email;}


    public void setEmail(String email) {
        this.email = email;}


    public Name getName() {
        return name;}


    public void setName(Name name) {
        this.name = name;}

    public static class Builder {
        private String staffId;
        private String email;
        private Name name;

        public Employee.Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Employee.Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Employee.Builder setName(Name name) {


            this.name = name;


            return this;

        }




        public Employee.Builder copy(Employee employee){
            this.staffId = staffId;
            this.email = email;
            this.name = name;
            return this;

        }



        public Employee build(){return new Employee(this);}


    }



    @Override

    public String toString() {


        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;Employee employee = (Employee) o;
        return staffId.equals(employee.staffId)
                && email.equals(employee.email)
                && name.equals(employee.name);

    }

    @Override

    public int hashCode() {
        return Objects.hash(staffId, email, name);

    }

}

