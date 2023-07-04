package com.hilel.homework6;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0, n = 1; i < arr.length; n = n + 2, i++) {
            arr[i] = n;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println( );

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}