/*
 *NameAPI .java
 * VuyolwethuKalolo
 * 214015637
 * 18-06-2022
 */

package za.ac.cput.schoolmanagement.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.service.entity.NameService;

import java.util.Optional;

@Component
public class NameAPI {
    private final NameService nameService;

    @Autowired
    public NameAPI(NameService nameService) {
        this.nameService = nameService;
    }
    public Name save (Name name){
        Optional<Name> read=this.nameService.read(name.getFirstName());
        if(read.isPresent()){
            this.nameService.read(name.getMiddleName());
        }
        return null;
    }
}
