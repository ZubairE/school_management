
/*
Adress.java
Class for entity Adress
Author : Zubair Esau (217100554)
Date 15 June 2022

 */


package za.ac.cput.schoolmanagement.domain.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class Adress implements Serializable {
    private static String unitNumber ;
    private String complexName ;
    private String streetNumber ;
    private String streetName;
    private int postalCode;
    private String city;


                                    //PRIVATE CONSTRUCTOR
    Adress(Builder builder){
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName ;
        this.postalCode = builder.postalCode;
        this.city = builder.city ;

    }




                                        // GETTERS AND SETTERS

    public static String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getComplexName() {
        return complexName;
    }

    public void setComplexName(String complexName) {
        this.complexName = complexName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return postalCode == adress.postalCode && Objects.equals(complexName, adress.complexName) && Objects.equals(streetNumber, adress.streetNumber) && Objects.equals(streetName, adress.streetName) && Objects.equals(city, adress.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complexName, streetNumber, streetName, postalCode, city);
    }

    //TO STRING
    @Override
    public String toString() {
        return "Adress{" +
                "unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                '}';
    }

    //Builder pattern class
    public static class Builder {
        private String unitNumber ;
        private String complexName ;
        private String streetNumber ;
        private String streetName;
        private int postalCode;
        private String city;

        public Builder setUnitNumber(String unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }

        public Builder setComplexName(String complexName) {
            this.complexName = complexName;
            return this;
        }

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder copy(Adress adress){
            this.unitNumber = unitNumber;
            this.complexName = complexName;
            this.streetNumber = streetNumber;
            this.streetName = streetName;
            this.postalCode = postalCode;
            this.city = city;
            return this;
        }


        public Adress build(){
            return new Adress(this);
        }



    }


}




