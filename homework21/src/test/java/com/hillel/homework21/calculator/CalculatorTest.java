package com.hillel.homework21.calculator;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {
    private static Calculator calculator = new Calculator();

    @BeforeSuite
    public void initSuite() {
        calculator = new Calculator();
        System.out.println("Before suite");
    }

    @BeforeGroups
    public void initGroup() {
        calculator = new Calculator();
        System.out.println("Before group");
    }

    @BeforeTest
    public void printBeforeTest() {
        System.out.println("Before test");
    }

    @BeforeClass
    public static void initClass() {
        System.out.println("Calculator instance was created");
        calculator = new Calculator();
    }

    @BeforeMethod
    public void beforeEachTest() {
        System.out.println("Before each test");
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
        int a = 15;
        int b = 0;
        String expectedResult = "/ by zero";
        int actualResult = (int) calculator.divide(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After each test");
    }

    @AfterClass
    public static void close() {
        System.out.println("All tests were finished");
    }
}