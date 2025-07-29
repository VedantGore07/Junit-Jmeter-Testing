package com.infosys;

import com.infosys.model.Employee;
import com.infosys.service.EmployeeServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVEmployeeServiceParameterizedTest {

    private EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/employees.csv", numLinesToSkip = 1)
    void testYearlySalaryWithCsv(int id, String name, double monthlySalary, double expectedYearly) {
        Employee e = new Employee(id, name, monthlySalary);
        double actual = employeeService.calculateYearlySalary(e);
        double expected = expectedYearly;
        assertEquals(expected, actual);
    }

}
