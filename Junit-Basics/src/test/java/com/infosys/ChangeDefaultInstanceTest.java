package com.infosys;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ChangeDefaultInstanceTest {

    CalculationUtil cu;

    @BeforeAll
    public void beforeAllInit()
    {
        System.out.println("BeforeAll is executed");
    }

    @AfterAll
    public void afterAll()
    {
        System.out.println("afterAll is executed");
    }

    @BeforeEach
    void init()
    {
        System.out.println("....Before every test it will execute");
        cu = new CalculationUtil();
    }

    @AfterEach
    void cleanupCode()
    {
        System.out.println("cleaning");
    }


    @Test  // to make method as a test method
    @DisplayName("SampleTest")
    void testShow()
    {
        System.out.println("hello");
    }

    // all test cases run Parallely
    // by default for each test cases there will be different instance
    @Test
    @DisplayName("Adding Test")
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
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.mult(5, 6);
        int expected = 30;
        assertEquals(expected, actual);
    }


}
