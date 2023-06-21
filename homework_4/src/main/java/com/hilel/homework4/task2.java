package com.hilel.homework4;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uan = scanner.nextInt();
        uan += 5000;
        int euro = uan / 28;
        System.out.println(euro);
    }
}