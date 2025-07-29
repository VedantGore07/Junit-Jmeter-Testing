package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    @Tag("Success")
    @DisplayName("Division Test")
    void testDivException()
    {
        CalculationUtil cu = new CalculationUtil();

        Assertions.assertThrows(ArithmeticException.class,
                ()-> cu.div(10,0));

    }
}
