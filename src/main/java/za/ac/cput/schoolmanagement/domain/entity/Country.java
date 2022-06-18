/**
 * Country.java
 * Country Entity for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.domain.entity;
import java.util.Objects;

public class Country {

    private final String id;
    private final String name;

    private Country(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private String id, name;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Country country){
            this.id = country.id;
            this.name = country.name;
            return this;
        }

        public Country build(){
            return new Country(this);
        }
    }
    public static class CountryName{
        private String country;

        public CountryName(String country){
            this.country = country;
        }

        public String getCountry() {
            return country;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Builder builder = (Builder) o;
        return id.equals(builder.id) && name.equals(builder.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString(){
        return "County{" +
                "id= '" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
