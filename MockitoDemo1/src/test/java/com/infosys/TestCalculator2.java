package com.infosys;


import com.infosys.entity.Calculator2;
import com.infosys.service.CalculatorService2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


public class TestCalculator2 {

    Calculator2 c = null;

    @Mock
    CalculatorService2 service;

    @BeforeEach
    public void setUpOnce()
    {
        c = new Calculator2(service);
    }

    @Test
    public void testPerform()
    {
        Mockito.when(service.add(2,3)).thenReturn(5);
        Assertions.assertEquals(5, c.perform(2,3));
    }
}
