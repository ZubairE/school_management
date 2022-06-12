package za.ac.cput.schoolmanagement.repository.entity;

import za.ac.cput.schoolmanagement.domain.entity.Adress;

import java.util.*;

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


    public List<Adress> findAll(){
        return this.AdressList;
    }

    @Override
    public Set<Adress> getAll() {
        return null;
    }

//    private static AdressRepository repo = null;
//    private Set<Adress> adressDB = null;
//
//
//    private AdressRepository(){
//        adressDB = new HashSet<Adress>();
//    }
//
//    public static AdressRepository getRepo(){
//        if (repo == null){
//            repo = new AdressRepository();
//        }
//        return repo;
//    }
//
//
//    @Override
//    public Adress create(Adress adress){
//        boolean success = adressDB.add(adress);
//        if (!success)
//            return null;
//        return adress;
//    }
//
//    @Override
//    public Adress read(String driverId) {
//
//        Adress adress = adressDB.stream()
//                .filter(e -> e.getUnitNumber().equals(e.getUnitNumber()))
//                .findAny()
//                .orElse(null);
//        return adress;
//
//    }
//
//    @Override
//    public Adress update(Adress adress)
//    {
//        Adress oldAdress = read(Adress.getUnitNumber());
//        if (oldAdress != null){
//            adressDB.remove(oldAdress);
//            adressDB.add(adress);
//            return adress;
//        }
//
//        return null;
//    }
//
//    @Override
//    public boolean delete( String unitNumber) {
//
//        Adress adressToDelete = read(unitNumber);
//        if (adressToDelete == null)
//            return false;
//
//        adressDB.remove(adressToDelete);
//        return true;
//
//    }
//
//    @Override
//    public Set<Adress> getAll() {
//
//        return adressDB;
//
//    }


}



