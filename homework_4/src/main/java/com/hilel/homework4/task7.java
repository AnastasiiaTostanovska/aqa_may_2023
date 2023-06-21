package com.hilel.homework4;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        if (c >= 100 && c < 1000) {
            System.out.println(--c);
        }
    }
}