package za.ac.cput.schoolmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.domain.entity.Name;
import za.ac.cput.schoolmanagement.service.entity.NameService;
import za.ac.cput.schoolmanagement.service.entity.NameServiveImpl;

import java.util.Optional;

@RestController
@RequestMapping("schoolmanagement/name-type/")
public class NameController {
  private final NameService nameService;

    @Autowired  public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @PostMapping ("save")
    public ResponseEntity<Name>  save(Name name){
      Name save=nameService.save(name);
      return  ResponseEntity.ok(save);
    }
    private Optional<Name>getById(String id){
      return this.nameService.read(id);
    }
    @GetMapping ("read/{id}")
    public ResponseEntity<Name> read(@PathVariable  String id){
      Name name=getById(id)
              .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
      return  ResponseEntity.ok(name);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){

      Optional <Name> name =getById(id);
      if (name.isPresent()) {
        this.nameService.delete(name.get());
      }
      return ResponseEntity.noContent().build();
    }
}
