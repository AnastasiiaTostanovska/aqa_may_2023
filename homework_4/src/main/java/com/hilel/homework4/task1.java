package com.hilel.homework4;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sm = scanner.nextInt();
        float length1 = (float) (sm / 2.54);
        System.out.println(length1 + " inches");

        int inches = scanner.nextInt();
        float length2 = (float) (inches * 2.54);
        System.out.println(length2 + " sm");
    }
}