package com.infosys.entity;

import com.infosys.service.CalculatorService;

public class Calculator {

    CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int getDivision(int a, int b) {
        return calculatorService.divide(a, b);
    }
}
