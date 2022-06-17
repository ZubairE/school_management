package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.repository.IRepository;
import java.util.List;

public interface ICountryRepository extends IRepository <Country, String> {
    List<Country> findAll();
}
