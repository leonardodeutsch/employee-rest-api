package com.leonardodeutsch.employeerestapi.dao;


import com.leonardodeutsch.employeerestapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
