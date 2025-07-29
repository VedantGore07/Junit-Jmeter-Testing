package com.infosys.service;

import com.infosys.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public double calculateYearlySalary(Employee employee) {

        double yearlySalary = 0;
        yearlySalary = employee.getMonthlySalary()*12;
        return yearlySalary;
    }


    @Override
    public double calculateHike(Employee employee) {

        double hike = 0;
        if(employee.getMonthlySalary() < 10000){
            hike = 2000;
        }
        else {
            hike = 1000;
        }
        return hike;

    }


}
