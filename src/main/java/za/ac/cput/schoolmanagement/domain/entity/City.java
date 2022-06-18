/**
 * City.java
 * City Entity for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.domain.entity;

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

        @Override
        public String toString(){
            return "City{" +
                    "id= '" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }