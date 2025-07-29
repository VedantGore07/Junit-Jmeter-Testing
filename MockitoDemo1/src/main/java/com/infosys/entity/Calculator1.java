package com.infosys.entity;


import com.infosys.service.CalculatorService1;

public class Calculator1 {

    CalculatorService1  service;

    public Calculator1(CalculatorService1 service)
    {
        this.service = service;
    }

    public void perform(int x, int y)
    {
        service.add(x, y);
    }
}
