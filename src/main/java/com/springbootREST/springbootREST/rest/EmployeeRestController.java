package com.springbootREST.springbootREST.rest;

import com.springbootREST.springbootREST.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootREST.springbootREST.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // constructor injection
    @Autowired
    public EmployeeRestController (EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // exposing  /employees and return a list of employees

    @GetMapping("/all")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }


}
