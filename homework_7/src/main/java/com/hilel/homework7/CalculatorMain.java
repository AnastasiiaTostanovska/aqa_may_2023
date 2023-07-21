package com.hilel.homework7;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = CalculatorUtils.getInt(scanner);
        int num2 = CalculatorUtils.getInt(scanner);
        char operation = CalculatorUtils.getOperation(scanner);
        float result = CalculatorUtils.calc(num1,num2,operation, scanner);
        System.out.println("Результат операции: "+ result);
    }
}