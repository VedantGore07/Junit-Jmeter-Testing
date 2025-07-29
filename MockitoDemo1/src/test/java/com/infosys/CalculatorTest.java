package com.infosys;

import com.infosys.entity.Calculator;
import com.infosys.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    Calculator c = null;
    CalculatorService calculatorService = Mockito.mock(CalculatorService.class);
//    Calculator calculator = new Calculator(calculatorService);

    @BeforeEach
    public void setup()
    {
        c = new Calculator(calculatorService);
    }

    @Test
    void testPerform()
    {
        when(calculatorService.divide(10,0))
                .thenThrow(ArithmeticException.class);
        assertThrows(ArithmeticException.class,
                () -> calculatorService.divide(10,0));
    }

}
