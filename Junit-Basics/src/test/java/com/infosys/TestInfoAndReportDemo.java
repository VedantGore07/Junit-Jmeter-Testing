package com.infosys;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInfoAndReportDemo {

    TestInfo testInfo;
    TestReporter testReporter;

    CalculationUtil cu;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        cu = new CalculationUtil();

        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
    }

    @Test
    @DisplayName("Adding Test")
    @Tag("Valid")
    void testAdd()
    {
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.add(10, 20);
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplication Test")
    void testMult()
    {
        testReporter.publishEntry("Running test class is"+testInfo.getTestClass()
                +"and test method is "+testInfo.getTestMethod()
                +"and display name is "+testInfo.getDisplayName());

        CalculationUtil cu = new CalculationUtil();
        int actual = cu.mult(5, 6);
        int expected = 30;
        assertEquals(expected, actual);
    }
}
