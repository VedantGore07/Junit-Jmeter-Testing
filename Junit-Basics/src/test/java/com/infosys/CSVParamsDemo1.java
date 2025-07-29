package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CSVParamsDemo1 {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Book1.csv", numLinesToSkip = 1)  // numLinesToSkip -> this skips the line from csv
    void add(int a, int b, int c)
    {
        int expected = c;
        int actual = a+b;
        Assertions.assertEquals(expected, actual);
    }
}
