package za.ac.cput.schoolmanagement.repository.entity;

import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.repository.IRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Repository
public class NameRepository implements NameRepositoryimp  {
    private final List<Name> nameList;

    private NameRepository(){
        this.nameList=new ArrayList<>();
    }


    public Name save( Name name)  {
        Name.nameNames nameNames =new Name.nameNames(name.getFirstName(),
                name.getMiddleName());
        Optional <Name> read=read (nameNames);
        if (read.isPresent()){
            delete(read.get());

        }
        this.nameList.add(name);
        return name;
    }
    public Optional<Name> read (Name.nameNames name)
    {
       return this.nameList.stream().filter(g -> g.getFirstName().equalsIgnoreCase(name.getFirstName()))
               .filter(g -> g.getMiddleName().equalsIgnoreCase(name.getMiddleName()))
              // .filter(g -> g.getLastName().equalsIgnoreCase(lastName))
               .findFirst();


    }
  public void delete (Name name){this.nameList.remove(name);}


    public List<Name> findAll (String firstName,String middleName,String lastName)
    {
        return this.nameList.stream()
                .filter(g -> g.getFirstName().equalsIgnoreCase(firstName))
                .filter(g -> g.getMiddleName().equalsIgnoreCase(middleName))
                .filter(g -> g.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());
    }
}
