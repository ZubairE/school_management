package za.ac.cput.schoolmanagement.service.entity;

import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.entity.Adress;
import za.ac.cput.schoolmanagement.domain.factory.entityfactory.AdressFactory;
import za.ac.cput.schoolmanagement.repository.entity.IAdressRepository;

import java.util.List;
import java.util.Optional;


@Service
public class AdressService implements IAdressService {

    private final IAdressRepository repository;


    public AdressService(IAdressRepository repository){
        this.repository = repository;
    }
//    private static IAdressService Serve;
//
//    private AdressService(){
//        this.repository = AdressRepository.getAdressRepository();
//    }
//
//    public static IAdressService getService(){
//
//        if (Serve == null)
//            Serve = new AdressService();
//        return Serve;
//
//    }


    @Override
    public Adress save(Adress adress) {
        Adress nmbr = AdressFactory.build(adress.getUnitNumber(),adress.getComplexName(), adress.getStreetNumber(), adress.getStreetName(), adress.getPostalCode(), adress.getCity());
        return this.repository.save(adress);
    }

    @Override
    public Optional<Adress> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public void delete(Adress adress) {
          this.repository.delete(adress);
    }

    @Override
    public List<Adress> findAll(){
        return (List<Adress>) this.repository.findAll();
    }


}
