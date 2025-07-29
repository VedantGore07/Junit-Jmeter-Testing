package com.infosys;

import com.infosys.model.Employee;
import com.infosys.service.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeServiceInvalidTest {

    EmployeeServiceImpl employeeService;

    @BeforeEach
    void init()
    {
        System.out.println("Setup: Initializing EmployeeService...");
        employeeService = new EmployeeServiceImpl();
    }

    @Test
    @Tag("Invalid")
    @DisplayName("Invalid: Negative Monthly Salary")
    void invalidSalaryTest() {
        Employee e = new Employee(3, "Bob", -5000);
        double yearly = employeeService.calculateYearlySalary(e);
        assertTrue(yearly < 0, "Yearly salary should be negative for invalid input");
    }
}
