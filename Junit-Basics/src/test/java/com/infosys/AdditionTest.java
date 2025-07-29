package com.infosys;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    @Test
    @Tag("Success")
    @DisplayName("Adding Test")
    void testAdd()
    {
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.add(10, 20);
        int expected = 30;
        assertEquals(expected, actual);

    }
}
