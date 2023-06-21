package com.hilel.homework4;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Положительное");
        }
        if (number < 0) {
            System.out.println("Отрицательное");
        }
        if (number == 0) {
            System.out.println("Ноль");
        }
    }
}