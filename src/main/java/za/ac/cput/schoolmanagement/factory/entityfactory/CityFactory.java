package za.ac.cput.schoolmanagement.factory.entityfactory;

import za.ac.cput.schoolmanagement.domain.entity.City;

public class CityFactory {
        public static City build(String id, String name) {
            if (id == null || id.isEmpty())
                throw new IllegalArgumentException("id is required");
            if (name == null || name.isEmpty())
                throw new IllegalArgumentException("name is required");
            return new City.Builder().id(id)
                    .name(name).build();
        }


}
