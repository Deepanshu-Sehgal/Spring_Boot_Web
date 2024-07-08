package com.datricle.web.springbootwebtutorial.controllers;

import com.datricle.web.springbootwebtutorial.dto.EmployeeDTO;
import com.datricle.web.springbootwebtutorial.entities.EmployeeEntity;
import com.datricle.web.springbootwebtutorial.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(path = "/getSecretMessage")
    public String getMySuperSecretMessage() {
        return "Secret message: abchd@^&";
    }


    //    PathVariable
    @GetMapping(path = "/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable Long employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    //  RequestParams
    @GetMapping
    public List<EmployeeEntity> getAllEmployee(@RequestParam(name = "inputAge",required = false) Integer age, @RequestParam(required = false) String sortBy) {
        return employeeRepository.findAll();
    }

    @PostMapping
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity inputEmployee) {
        return employeeRepository.save(inputEmployee);
    }

    @PutMapping
    String updateEmp() {
        return "Hello from put";
    }

}