package com.infosys;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleParamsTesting {

    CalculationUtil cu;

    @BeforeEach
    void init()
    {
        cu = new CalculationUtil();
    }

    @ParameterizedTest
    @ValueSource(ints = {10,29,45,56,87})
    @DisplayName("Even value check test")
    void isEvenTest(int number)
    {
        Assertions.assertTrue(cu.isEven(number));
    }

    @ParameterizedTest
    @NullSource
    void checkNull(String value)
    {
        Assertions.assertEquals(null, value);
    }

    @ParameterizedTest
    @EmptySource
    void checkEmptyValues(String value)
    {
        Assertions.assertEquals("", value);
    }


    @ParameterizedTest
    @NullAndEmptySource
    void checkNullandEmpty(String value)
    {
        Assertions.assertTrue(value==null || value.isEmpty());
    }
}
