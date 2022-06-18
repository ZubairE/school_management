/**
 * CountryFactory.java
 * Country Factory class for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.factory.entityfactory;

import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.helper.HelpStrings;

public class CountryFactory {
    public static Country build(String id, String name){
        HelpStrings.checkStringParam("id", id);
        HelpStrings.checkStringParam("name", name);
        return new Country.Builder().id(id).name(name).build();
    }

    public static Country.CountryName build(Country country) {
        return new Country.CountryName (country.getId());
    }
}
