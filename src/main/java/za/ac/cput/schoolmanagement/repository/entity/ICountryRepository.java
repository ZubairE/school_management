/**
 * ICountryRepository.java
 * Country Repository Interface for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.Country;
import za.ac.cput.schoolmanagement.repository.IRepository;
import java.util.List;

public interface ICountryRepository extends IRepository <Country, String> {
    List<Country> findAll();
}
