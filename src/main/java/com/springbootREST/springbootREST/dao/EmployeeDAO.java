package com.springbootREST.springbootREST.dao;

import com.springbootREST.springbootREST.entities.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

}
