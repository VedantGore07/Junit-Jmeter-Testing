package com.infosys;

import com.infosys.model.Employee;
import com.infosys.service.EmployeeServiceImpl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private EmployeeServiceImpl employeeService;

    @BeforeAll
    static void beforeAll()
    {
        System.out.println("BeforeAll is executed");
    }

    @AfterAll
    static void afterAll()
    {
        System.out.println("afterAll is executed");
    }

    @BeforeEach
    void init()
    {
        System.out.println("Setup: Initializing EmployeeService...");
        employeeService = new EmployeeServiceImpl();
    }

    @AfterEach
    void cleanupCode()
    {
        System.out.println("Teardown: Cleaning up after test...");
    }


    @Test
    @DisplayName("Test Yearly Salary Calculation for 8000 Monthly")
    void testCalculateYearlySalary() {
        Employee emp = new Employee(1, "Zenitsu", 10000);
        double actual = employeeService.calculateYearlySalary(emp);
        double expected = 120000;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test Hike Calculation for < 10000 Monthly")
    void testCalculateHike_LowSalary() {
        Employee e = new Employee(2, "Inosuke", 8000);
        double actual = employeeService.calculateHike(e);
        double expected = 2000;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test Hike Calculation for >= 10000 Monthly")
    void testCalculateHike_HighSalary() {
        Employee e = new Employee(3, "Tanjiro", 12000);
        double actual = employeeService.calculateHike(e);
        double expected = 1000;
        assertEquals(expected, actual);
    }


    @Test
    @Disabled
    @DisplayName("Disabled test")
    void testFail()
    {
        System.out.println("This test is disabled and should not run.");
    }

}
