package com.hillel.homework9;


public class StringMain {

    public static void main(String[] args) {

        String str = "I like Java!!!";

        System.out.println(MethodsString.printLastSymbol(str));
        System.out.println(MethodsString.printEndWith(str));
        System.out.println(MethodsString.printStartWith(str));
        System.out.println(MethodsString.printContained(str));
        System.out.println(MethodsString.printIndex(str));
        System.out.println(MethodsString.printReplacement(str));
        System.out.println(MethodsString.printLowerCase(str));
        System.out.println(MethodsString.printUpperCase(str));
        System.out.println(MethodsString.printSubstring(str));

    }
}

