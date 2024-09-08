package com.rajibul.cruddemo.dao;

import com.rajibul.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();


    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
