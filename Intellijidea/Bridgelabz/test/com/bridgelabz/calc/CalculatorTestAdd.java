package com.bridgelabz.calc;

import org.junit.*;


//following SRP - Single Responsibility Principle
//following DRY - Don't Repeat yourself Principle

public class CalculatorTestAdd{
    //eager initialization(DRY Principle is followed)
    Calculator calc = new Calculator();

    @Before
    public void before() {
        System.out.println("Inside Before");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Inside Before Class");
    }

    @After
    public void after() {
        System.out.println("Inside After");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Inside After Class");
    }


    @Test
    public void testAddWhenTwoPositiveIntegers_ThenPass() {
// Lazy Initialization(DRY Principle not follwed)
//        Calculator calc = new Calculator();
        long actual = calc.add(10,20);
        long expected = 30;
        Assert.assertEquals(expected, actual);
        System.out.println("method-1");
    }

    @Test
    public void testAddWhenTwoPositiveIntegers_ThenNotEqualPass() {
        long actual = calc.add(10,20);
        long expected = 20;
        Assert.assertNotEquals(expected, actual);
        System.out.println("method-2");
    }

}
