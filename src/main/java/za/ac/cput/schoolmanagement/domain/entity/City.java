/**
 * City.java
 * City Entity for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.domain.entity;

import java.util.Objects;

public class City {
    private final String id;
    private final String name;
    private final String country;

    private City(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    this.country = builder.country;}

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCountry(){
        return country;
        }

        public static class Builder {
            private String id, name, country;

            public City.Builder id(String id) {
                this.id = id;
                return this;
            }

            public City.Builder name(String name) {
                this.name = name;
                return this;
            }

            public City.Builder country(String country){
                this.country = country;
                return this;
            }

            public City.Builder copy(City city){
                this.id = city.id;
                this.name = city.name;
                this.country = city.country;
                return this;
            }

            public City build(){
                return new City(this);
            }
        }
    public static class CityName{
        private String id, name, country;

        public CityName(String id, String name, String country){
            this.id = id;
            this.name = name;
            this.country = country;
        }

        public String getId(String id){
            return id;
        }

        public String getName(String name){
            return name;
        }
        public String getCountry(String country){
            return country;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Builder builder = (City.Builder) o;
        return id.equals(builder.id) && name.equals(builder.name) && country.equals(builder.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

        @Override
        public String toString(){
            return "City{" +
                    "id= '" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }