package com.example.ex2bb;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/employees")
    List<Employee> all(){return repo.findAll();}

    @PostMapping("/employees")
    Employee newEmp(@RequestBody Employee newEmp){return repo.save(newEmp);}
    @DeleteMapping("/employees/{id}")
    void deleteEmp(@PathVariable Long id){repo.deleteById(id);}
}
