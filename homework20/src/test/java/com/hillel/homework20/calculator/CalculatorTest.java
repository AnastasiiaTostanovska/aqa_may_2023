package com.hillel.homework20.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        System.out.println("Calculator was created");
        calculator = new Calculator();
    }

    @Test
    @Order(1)
    @DisplayName("Test 1 - addition")
    public void testAddition() {
        int expectedResult = 21;
        int actualResult = calculator.add(14, 7);
        Assertions.assertEquals(expectedResult, actualResult, "Addition result is incorrect");

    }

    @Test
    @Order(2)
    @DisplayName("Test 2 - subtraction")
    public void testSubtraction() {
        int expectedResult = 7;
        int actualResult = calculator.subtract(14, 7);
        Assertions.assertEquals(expectedResult, actualResult, "Subtraction result is incorrect");
    }

    @Test
    @Order(3)
    @DisplayName("Test 3 - multiplication")
    public void testMultiplication() {
        int expectedResult = 98;
        int actualResult = calculator.multiply(14, 7);
        Assertions.assertEquals(expectedResult, actualResult, "Multiplication result is incorrect");
    }

    @Test
    @Order(4)
    @DisplayName("Test 4 - division")
    public void testDivision() {
        int expectedResult = 2;
        double actualResult = calculator.divide(14, 7);
        Assertions.assertEquals(expectedResult, actualResult, "Division result is incorrect");
    }

    @Test
    @Order(5)
    @DisplayName("Test 5 - division by 0")
    void exceptionTesting() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(15, 0));
        Assertions.assertEquals("/ by zero", exception.getMessage());
    }

    @AfterAll
    public static void close() {
        System.out.println("All tests are finished");
    }

}
