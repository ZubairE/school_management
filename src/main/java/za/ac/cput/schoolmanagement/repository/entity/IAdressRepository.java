
/*
IAdressRepository.java
Class handling repo methods
Author : Zubair Esau (217100554)
Date 15 June 2022

 */

package za.ac.cput.schoolmanagement.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.List;
import java.util.Set;


@Repository

public interface IAdressRepository extends JpaRepository<Adress,String> {

            List<Adress> findByUnitNumber(String unitNumber);
}


