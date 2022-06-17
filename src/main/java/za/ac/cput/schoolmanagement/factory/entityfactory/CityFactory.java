/**
 * CityFactory.java
 * City Factory class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.factory.entityfactory;

import za.ac.cput.schoolmanagement.domain.entity.City;

public class CityFactory {
    public static City build(String id, String name, String country) {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException("id is required");
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("name is required");
        if (country == null || country.isEmpty())
            throw new IllegalArgumentException("country is required");
        return new City.Builder().id(id)
                .name(name)
                .country(country).build();
    }
}
