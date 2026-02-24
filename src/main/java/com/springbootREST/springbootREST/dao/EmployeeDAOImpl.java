package com.springbootREST.springbootREST.dao;

import com.springbootREST.springbootREST.entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    // defining field for entity manager
    private EntityManager entityManager;

    // setting up constructor injection
    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        // creating a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        // executing query and get a result
        List<Employee> tempEmployeeList = theQuery.getResultList();

        // returning the results
        return tempEmployeeList;
    }


}
