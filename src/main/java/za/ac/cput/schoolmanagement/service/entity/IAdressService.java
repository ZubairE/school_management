package za.ac.cput.schoolmanagement.service.entity;

import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;
import java.util.Set;

public interface IAdressService extends IService<Adress, String > {

   List<Adress> findAll();

}
