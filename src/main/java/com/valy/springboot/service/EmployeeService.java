package com.valy.springboot.service;

import com.valy.springboot.model.Employee;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
