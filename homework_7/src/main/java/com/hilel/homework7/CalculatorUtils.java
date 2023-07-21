package com.hilel.homework7;

import java.util.Scanner;

public class CalculatorUtils {
    public static int getInt(Scanner scanner) {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt(scanner);
        }

        return num;
    }
    public static char getOperation(Scanner scanner) {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            return scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Введите одну из следующих операций: +, -, *, /");
            scanner.next();
            operation = getOperation(scanner);
        }
        return operation;
    }
    public static float calc(int num1, int num2, char operation, Scanner scanner) {
        float result;
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (float) num1 / num2;
            default:
                System.out.println("Операция не распознана. Введите одну из следующих операций: +, -, *, /");
                result = calc(num1, num2, getOperation(scanner), scanner);
        }
        return result;
    }
}