package com.infosys;

import com.infosys.model.Employee;
import com.infosys.service.EmployeeServiceImpl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeServiceValidTest {

    EmployeeServiceImpl employeeService;

    @BeforeEach
    void init()
    {
        System.out.println("Setup: Initializing EmployeeService...");
        employeeService = new EmployeeServiceImpl();
    }

    @Test
    @Tag("Valid")
    @DisplayName("Valid: Hike for 9500 Salary")
    void validHikeLowSalary() {
        Employee e = new Employee(1, "John", 9500);
        double actual = employeeService.calculateHike(e);
        double expected = 2000;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Valid: Yearly Salary for 10000 Monthly")
    void validYearlySalary() {
        Employee e = new Employee(2, "Jane", 10000);
        double actual = employeeService.calculateYearlySalary(e);
        double expected = 120000;
        assertEquals(expected, actual);
    }
}
