package com.hilel.homework4;

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b > 9 && b < 100) {
            int ones = b % 10;
            int tens = b / 10;
            System.out.println(ones + " " + tens);
        }
    }
}