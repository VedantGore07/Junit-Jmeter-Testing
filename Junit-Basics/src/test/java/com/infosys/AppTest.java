package com.infosys;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest
{

    CalculationUtil cu;

    @BeforeAll
    static void beforeAllInit()
    {
        System.out.println("BeforeAll is executed");
    }

    @AfterAll
    static void afterAll()
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
    @Order(value = 5)
    void testShow()
    {
        System.out.println("hello");
    }

    // all test cases run parallely
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

    @Test
    @Disabled
    void testFail()
    {
        Assertions.fail("This test is going to failed always");
    }

    @Test
    @Order(value = 2)
    void testNullString()
    {
        CalculationUtil cu = new CalculationUtil();
        String input = "1234";
//        String input = null;
        String result = cu.parseString(input);
        Assertions.assertNotNull(result);
    }

    @Test
    @DisplayName("Division Test")
    @Order(value = 1)
    void testDivException()
    {
        CalculationUtil cu = new CalculationUtil();

        Assertions.assertThrows(ArithmeticException.class,
                ()-> cu.div(10,0));

    }


    @Test
    @DisplayName("Division test for does not throws")
    @Order(value = 6)
    void testDivExceptionDoesNotThrows(){
        CalculationUtil cu = new CalculationUtil();

        Assertions.assertDoesNotThrow(
                () -> cu.div(10, 2), "exception in code");
    }

    @Test
    @Order(value = 7)
    void testCompareObjects()
    {
        String s1 = "Hi";
        String s2 = "Hi";
        Assertions.assertSame(s1, s2);

        String s3 = new String("Hi"); //Heap memory
        String s4 = new String("Hi"); //Heap memory
        assertEquals(s3, s4);
    }

    @Test
    @Order(value = 8)
    public void demoTest()
    {
        String str = "Info";
        assertEquals("Infosys", str.concat("sys"));
    }


    // assertAll it will be true if all cases are true, it is similar to AND condition
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

    @RepeatedTest(3)
    @DisplayName("Repetition Test")
    void myTest(RepetitionInfo repetitionInfo)
    {
        System.out.println(repetitionInfo.getCurrentRepetition());
        assertEquals("Hi", "Hi");
    }


}
