package com.hillel.homework21.calculator;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {
    private static Calculator calculator = new Calculator();

    @BeforeClass
    public static void initClass() {
        System.out.println("CalculatorTest class setup");
        calculator = new Calculator();
    }

    @BeforeMethod
    public void initMethod() {
        System.out.println("Test method setup");
    }

    @Test(groups = {"smoke", "regression"})
    public void testAddition() {
        int expectedResult = 21;
        int actualResult = calculator.add(14, 7);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = {"smoke", "regression"})
    public void testSubtraction() {
        int expectedResult = 7;
        int actualResult = calculator.subtract(14, 7);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(groups = {"regression"})
    public void testMultiplication() {
        int expectedResult = 98;
        int actualResult = calculator.multiply(14, 7);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(groups = {"regression"})
    public void testDivision() {
        double expectedResult = 2.0;
        double actualResult = calculator.divide(14, 7);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(expectedExceptions = ArithmeticException.class, groups = {"regression"})
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("Test method teardown");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("CalculatorTest class teardown");
    }
}