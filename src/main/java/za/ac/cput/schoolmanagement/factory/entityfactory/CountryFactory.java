package za.ac.cput.schoolmanagement.factory.entityfactory;

import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.helper.HelpStrings;

public class CountryFactory {
    public static Country build(String id, String name) {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException("id is required");
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("name is required");
        return new Country.Builder().id(id)
                .name(name).build();
    }
}
