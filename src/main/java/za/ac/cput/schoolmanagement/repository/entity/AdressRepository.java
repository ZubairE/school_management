package za.ac.cput.schoolmanagement.repository.entity;

import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.entity.Adress;

import java.util.*;


@Repository
public class AdressRepository implements IAdressRepository {

    private final List<Adress> AdressList;
    private static AdressRepository ADRESS_REPOSITORY;

    private AdressRepository(){this.AdressList = new ArrayList<>();}

    public static AdressRepository getAdressRepository(){
        if (ADRESS_REPOSITORY == null)
            ADRESS_REPOSITORY = new AdressRepository();
        return ADRESS_REPOSITORY;
    }


    public Adress save(Adress adress){
        Optional<Adress> read = read(adress.getUnitNumber());
        if (read.isPresent()){
            delete(read.get());
        }
        this.AdressList.add(adress);
        return adress;

    }


    public Optional<Adress> read(String unitNumber){
        return   this.AdressList.stream().filter(g-> g.getUnitNumber().equalsIgnoreCase(unitNumber))
                .findFirst();
    }


    public void delete(Adress adress){
        this.AdressList.remove(adress);
    }


    public Set<Adress> findAll(){
        return (Set<Adress>) this.AdressList;
    }

    @Override
    public Set<Adress> getAll() {
        return null;
    }


}



