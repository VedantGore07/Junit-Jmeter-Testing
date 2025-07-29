package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CSVParamsDemo {

    @ParameterizedTest
    @CsvSource({"10,20", "2,4"})
    void add(int a, int b)
    {
        int expected = 6;
        int actual = a+b;
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(value = {"10!20", "30!40"}, delimiterString = "!")
    void add1(int a, int b)
    {
        int expected = 70;
        int actual = a+b;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"10,20,30", "3,4,7"})
    void add2(int a, int b, int c)
    {
        int actual = a+b;
        Assertions.assertEquals(c, actual);
    }
}
