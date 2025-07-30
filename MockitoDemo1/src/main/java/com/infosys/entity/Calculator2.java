package com.infosys.entity;

import com.infosys.service.CalculatorService2;

public class Calculator2 {

    CalculatorService2  service;

    public Calculator2(CalculatorService2 service)
    {
        this.service = service;
    }

    public int perform(int x, int y)
    {
        return service.add(x, y);
    }
}
