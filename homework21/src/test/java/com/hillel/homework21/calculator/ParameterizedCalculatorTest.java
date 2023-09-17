package com.hillel.homework21.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParameterizedCalculatorTest {
    private Calculator calculator = new Calculator();

    @Test(dataProvider = "intProvider", dataProviderClass = DataProviderTest.class)
    public void testAddition1(int a, int b, int result) {
        int actualResult = calculator.add(a, b);
        Assert.assertEquals(result, actualResult);
    }
}