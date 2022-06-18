package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.List;

public interface NameRepositoryimp extends IRepository <Name,Name.nameNames>{
    List<Name> findAll (String firstName, String middleName, String lastName);

}
