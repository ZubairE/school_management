package za.ac.cput.schoolmanagement.factory.entityfactory;

import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.helper.HelpStrings;

public class AdressFactory {
    public static Adress build(String unitNumber, String complexName, String streetNumber, String streetName, int postalCode, String city) {
          if (HelpStrings.isEmptyOrNull(unitNumber))
              throw new IllegalArgumentException("unit number");
           return new Adress.Builder().setUnitNumber(unitNumber).setComplexName(complexName)
                   .setStreetNumber(streetNumber)
                   .setStreetName(streetName)
                   .setPostalCode(postalCode)
                   .setCity(city)
                   .build();
    }

}


