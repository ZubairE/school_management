package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.Set;

public interface IAdressRepository extends IRepository<Adress,String> {

        public Set<Adress> getAll();


    }


