/**
 * CityFactory.java
 * City Factory class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.factory.entityfactory;

import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.helper.HelpStrings;

public class CityFactory {
    public static City build(String id, String name, String country){
        HelpStrings.checkStringParam("id", id);
        HelpStrings.checkStringParam("name", name);
        HelpStrings.checkStringParam("country", country);
        return new City.Builder().id(id).name(name).country(country).build();
    }

    public static City.CityName build(City city) {
        return new City.CityName (city.getId());
    }
}
