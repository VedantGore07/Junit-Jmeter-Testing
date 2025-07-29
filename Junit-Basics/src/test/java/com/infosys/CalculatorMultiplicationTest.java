package com.infosys;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorMultiplicationTest {

    @Test
    @Tag("Slow")
    @Tag("Failure")
    @DisplayName("Multiplication Test")
    void testMult()
    {
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.mult(5, 6);
        int expected = 30;
        assertEquals(expected, actual);
    }
}
