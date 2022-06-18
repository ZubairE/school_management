package za.ac.cput.schoolmanagement.factory.entityfactory;


import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.helper.HelpStrings;


public class NameFactory {
    public static Name build(String firstName, String middleName, String lastName) {
        if (HelpStrings.isEmptyOrNull(firstName))
            throw new IllegalArgumentException("first name");

        if (HelpStrings.isEmptyOrNull(middleName))
            throw new IllegalArgumentException("Middle name");

        if (HelpStrings.isEmptyOrNull(lastName))
            throw new IllegalArgumentException("last name");

        return new Name.Builder().seFirstName(lastName)
                .middleName(middleName)
                .lastName(lastName)
                .build();

    }
}