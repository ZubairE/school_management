package za.ac.cput.schoolmanagement.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.Set;


@Repository

public interface IAdressRepository extends JpaRepository<Adress,String> {
}


