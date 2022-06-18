/*
Author:Ismail Watara
Student_Number: 219018790
Date: 18 June 2022
EmployeeController.java
*/
package za.ac.cput.schoolmanagement.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.domain.entity.Employee;
import za.ac.cput.schoolmanagement.service.entity.IEmployeeService;
import java.util.List;




@RestController

@RequestMapping("schoolManagement/employee")

@Slf4j

public class EmployeeController {
    private final IEmployeeService EmployeeService;



    @Autowired
    public EmployeeController(IEmployeeService EmployeeService){
        this.EmployeeService = EmployeeService;

    }
    @PostMapping("save")
    public ResponseEntity<Employee>
    save(@RequestBody Employee employee){
        log.info("Capture request: {}", employee);
        try{
            Employee response = this.EmployeeService.save(employee);
            return ResponseEntity.ok(response);

        } catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    e.getMessage());
        }
    }
    @GetMapping("read/{staffId}")
    public ResponseEntity<Employee>
    read(@PathVariable String staffId) {
        log.info("Read request: {}", staffId);
        Employee response = this.EmployeeService.read(staffId)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not located"));
        return ResponseEntity.ok(response);

    }


    @DeleteMapping("delete/{Employee}")
    public ResponseEntity<Void> delete(@PathVariable Employee employee){
        log.info("Remove request: {}", employee);
        this.EmployeeService.delete(employee);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Employee>> getAll() {
        List<Employee> response = this.EmployeeService.getAll();
        return ResponseEntity.ok(response);

    }

}