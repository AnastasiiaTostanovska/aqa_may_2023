package com.hillel.homework9;

public class MethodsString {
    public static char printLastSymbol(String str){

        return str.charAt(str.length()-1);
    }
    public static boolean printEndWith(String str) {

        return str.endsWith("!!!");
    }
    public static boolean printStartWith(String str){

        return str.startsWith("I like");
    }
    public static boolean printContained (String str){

        return str.contains("Java");
    }
    public static int printIndex (String str){

        return str.indexOf("Java");
    }
    public static String printReplacement (String str) {

        return str.replace("a", "o");
    }
    public static String printLowerCase (String str) {

        return str.toLowerCase();
    }
    public static String printUpperCase (String str) {

        return str.toUpperCase();
    }
    public static String printSubstring (String str) {

        return str.substring(7, 11);
    }

}

