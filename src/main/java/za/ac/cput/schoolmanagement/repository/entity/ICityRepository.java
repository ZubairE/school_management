/**
 * ICityRepository.java
 * City Repository Interface for School Management Assignment
 * Author: Uwais Ali Rawoot (216217296)
 * Date: 17 June 2022
 */

package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.City;
import za.ac.cput.schoolmanagement.repository.IRepository;
import java.util.List;

public interface ICityRepository extends IRepository<City, String> {
    List<City> findAll();
}
