package com.hilel.homework4;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        if (h > 9 && h < 100) {
            int ed = h % 10;
            int result = ed * (h / 10);
            System.out.println(result);
            if (h > result) {
                System.out.println("число больше");
            } else {
                System.out.println("произведение цифр числа больше");
            }
        }
    }
}