/*
 *NameService.java
 * VuyolwethuKalolo
 * 214015637
 * 18-06-2022
 */
package za.ac.cput.schoolmanagement.service.entity;

import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;
@Service
public interface NameService extends IService <Name,String>{
   //List<Name> findAll (String firstName, String middleName, String lastName);
}
