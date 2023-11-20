package com.leonardodeutsch.employeerestapi.service;

import com.leonardodeutsch.employeerestapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
