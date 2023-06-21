package com.hilel.homework4;

import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        if (f > 9 && f < 100) {
            int ones2 = f % 10;
            int tens2 = f / 10;
            int sum = ones2 + tens2;
            System.out.println(sum);
        }
    }
}