package com.hillel.homework20.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParameterizedCalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        System.out.println("Calculator was created");
        calculator = new Calculator();
    }

    @ParameterizedTest
    @MethodSource("getValues")
    @DisplayName("Test subtract a-b")
    public void testSubtraction(int a, int b, int result) {
        int actualResult = calculator.subtract(a, b);
        Assertions.assertEquals(result, actualResult, "actual result:" + actualResult + " expected was :" + result);
    }


    public static Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.of(10, 3, 7),
                Arguments.of(5, 1, 4),
                Arguments.of(20, 5, 15)
        );
    }

    @AfterAll
    public static void close() {
        System.out.println("All tests are finished");
    }

}