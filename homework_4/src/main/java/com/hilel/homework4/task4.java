package com.hilel.homework4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        if (d > 9 && d < 100) {
            int ones = d % 10;
            int tens = d / 10;
            System.out.println(tens * 10 + "+" + ones);
        }
    }
}