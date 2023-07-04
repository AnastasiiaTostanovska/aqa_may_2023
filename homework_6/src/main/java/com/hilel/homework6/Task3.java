package com.hilel.homework6;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = (int) (Math.random() * 6);
            arr1[i] = (int) (Math.random() * 6);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i] + " ");
        }

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += arr[i];
            average2 += arr1[i];
        }

        average1 /= arr.length;
        average2 /= arr1.length;

        System.out.println( );

        if (average1>average2){
           System.out.print("Среднее арифметическое первого массива " + average1 + " больше среднего арифметического второго массива " + average2);
        }
        if (average1<average2){
            System.out.print("Среднее арифметическое первого массива " + average1 + " меньше среднего арифметического второго массива " + average2);
        }
        if (average1==average2){
            System.out.print("Среднее арифметическое первого массива " + average1 + " равно среднему арифметическому второго массива " + average2);
        }
    }
}