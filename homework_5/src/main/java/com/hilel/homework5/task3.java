package com.hilel.homework5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        if (n <= 20) {
            System.out.println(n + "!=" + factorial);
        } else {
            System.out.println("Для корректного вычисления введите число <= 20");
        }
    }
}
