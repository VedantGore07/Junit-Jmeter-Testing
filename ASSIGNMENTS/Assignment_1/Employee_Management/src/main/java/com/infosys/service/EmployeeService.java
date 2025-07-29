package com.infosys.service;

import com.infosys.model.Employee;

public interface EmployeeService {

    double calculateHike(Employee employee);
    double calculateYearlySalary(Employee employee);
}
