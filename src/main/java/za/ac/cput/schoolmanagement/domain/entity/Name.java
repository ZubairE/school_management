package za.ac.cput.schoolmanagement.domain.entity;

import javax.persistence.Entity;
import java.util.Objects;

//import lombok.Builder;
@Entity
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(Builder builder){
       this.firstName=builder. firstName;
       this.middleName=builder. middleName;
        this.lastName=builder. lastName;
    }


    public Name(String firstName, String middleName, String lastName) {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 public static class nameNames{
     public nameNames(String firstName, String middleName) {
         this.firstName = firstName;
         this.middleName = middleName;

     }

     public String getFirstName() {
         return firstName;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         nameNames nameNames = (nameNames) o;
         return firstName.equals(nameNames.firstName) && middleName.equals(nameNames.middleName);
     }

     @Override
     public int hashCode() {
         return Objects.hash(firstName, middleName);
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

     private String firstName,middleName;
    }

    public static class Builder{
        private String firstName,middleName,lastName;

        public Builder firstName(String firstName){

            return this;
        }
        public Builder middleName(String middleName){

            return this;
        }
        public Builder lastName(String lastName){

            return this;
        }
        public Builder copy (Name name){
            this.firstName= firstName;
            this.middleName =middleName;
            this.lastName=lastName;

            return this;
        }


        public Name.Builder seFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Name.Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        public Name.Builder setLastName(String lastNameName) {
            this.lastName = lastName;
            return this;
        }
        public Name build(){
            return new Name (this);}

    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }




}

