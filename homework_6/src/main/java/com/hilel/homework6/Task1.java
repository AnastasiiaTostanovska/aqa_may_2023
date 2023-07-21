package com.hilel.homework6;


public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i=0,n=2; i<arr.length; n=n+2,i++){
            arr[i] = n;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println( );

        for (int h : arr) {
            System.out.println(h);
        }
    }
}
