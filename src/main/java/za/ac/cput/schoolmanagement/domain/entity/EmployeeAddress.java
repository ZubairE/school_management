package za.ac.cput.schoolmanagement.domain.entity;

import java.util.Objects;

public class EmployeeAddress {
    private final String staffId, address;

    private EmployeeAddress(Builder buider){
        this.staffId = buider.staffId;
        this.address = buider.address;;
    }

    public String getStaffId(){
        return staffId;
    }
    public String getAddress(){
        return address;
    }
    public static class EmployeeAddressId {
        private String staffId, address;

        public EmployeeAddressId(String staffId){
            this.staffId = staffId;
        }
        public String getStaffId(){
            return staffId;
        }

    @Override
        public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() !=o.getClass())return false;
            EmployeeAddressId that = (EmployeeAddressId) o;
            return staffId.equals(that.staffId);
            }

    public int hasCode(){
       return Objects.hash(staffId);
        }
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode(){

        return Objects.hash(staffId);
    }
    public static class Builder{
        private String staffId, address;

        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder staffId(String staffId){
            this.staffId = staffId;
            return this;
        }
        public Builder copy(EmployeeAddress employeeAddress) {
             this.address = employeeAddress.address; this.staffId = employeeAddress.staffId;
            return this;

        }
        public EmployeeAddress build(){
            return new EmployeeAddress(this);
        }
    }
    }


