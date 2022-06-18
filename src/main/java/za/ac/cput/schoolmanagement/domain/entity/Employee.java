/*
Author:Ismail Watara
Student_Number: 219018790
Date: 10 June 2022
Employee.java
*/


package za.ac.cput.schoolmanagement.domain.entity;
import javax.persistence.Entity;

import javax.persistence.Id;


    @Entity
    public class Employee {


        @Id
        private String staffId;
        private String email;
        private String firstName;
        private String middleName;
        private String lastName;


        private Employee(Builder builder) {
            this.staffId = builder.staffId;
            this.email = builder.email;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.middleName = builder.middleName;
        }

        public Employee() {


        }

        public String getStaffId() {
            return staffId;
        }

        public void setStaffId(String staffId) {
            this.staffId = staffId;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "staffId='" + staffId + '\'' +
                    ", email='" + email + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' + '}';

        }

        public static class Builder {
            private String staffId;
            private String email;
            private String firstName;
            private String middleName;
            private String lastName;


            public Builder setStaffId(String staffId) {
                this.staffId = staffId;
                return this;

            }

            public Builder setEmail(String email) {
                this.email = email;
                return this;
            }

            public Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            public Builder setMiddleName(String middleName) {
                this.middleName = middleName;
                return this;

            }

            public Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;

            }


            public Builder copy(Employee employee) {
                this.staffId = employee.staffId;
                this.email = employee.email;
                this.firstName = employee.firstName;
                this.middleName = employee.middleName;
                this.lastName = employee.lastName;

                return this;
            }

            public Employee build() {
                return new Employee(this);
            }


        }
    }
