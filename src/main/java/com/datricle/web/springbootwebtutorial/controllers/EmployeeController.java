package com.datricle.web.springbootwebtutorial.controllers;

import com.datricle.web.springbootwebtutorial.dto.EmployeeDTO;
import com.datricle.web.springbootwebtutorial.entities.EmployeeEntity;
import com.datricle.web.springbootwebtutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/getSecretMessage")
    public String getMySuperSecretMessage() {
        return "Secret message: abchd@^&";
    }


    //    PathVariable
    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    //  RequestParams
    @GetMapping
    public List<EmployeeDTO> getAllEmployee(@RequestParam(name = "inputAge", required = false) Integer age, @RequestParam(required = false) String sortBy) {
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeEntity inputEmployee) {
        return employeeService.createNewEmployee(inputEmployee);
    }

    @PutMapping
    String updateEmp() {
        return "Hello from put";
    }

}