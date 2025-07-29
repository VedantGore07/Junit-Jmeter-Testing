package com.infosys;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedTestClassesDemo {

    CalculationUtil cu;

    @BeforeEach
    void init()
    {
        System.out.println("....Before every test it will execute");
        cu = new CalculationUtil();
    }


    @Nested
    class AdditionTest{

        @Test
        @DisplayName("Addition test for Positive values")
        void add_test_positive()
        {
            int actual = cu.add(10,20);
            int expected = 30;
            Assertions.assertEquals(expected, actual, "Not Equal");
        }

        @Test
        @DisplayName("Addition test for Negative values")
        void add_test_negative()
        {
            int actual = cu.add(-10,-20);
            int expected = -30;
            Assertions.assertEquals(expected, actual, "Not Equal");
        }


    }

    @Test
    @DisplayName("AssertAll in multiple test")
    @Order(value = 9)
    public void testMultiply()
    {
        int actual1 = cu.mult(0, 5);
        int actual2 = cu.mult(-2, -2);
//        assertEquals(0, actual1);
//        assertEquals(4, actual2);

        assertAll(
                ()->assertEquals(0,cu.mult(0,4)),
                ()->assertEquals(4,cu.mult(-2,-2)),
                ()->assertEquals(-2,cu.mult(-2,1))
        );
    }
}
