package com.hillel.homework10;


public class BuilderMain {
    public static void main(String[] args) {

        StringBuilder stringBuilder = UtilsBuilderString.createString(3,56);
        System.out.println(stringBuilder);
        System.out.println(UtilsBuilderString.changeString(stringBuilder));
        System.out.println(UtilsBuilderString.change2String(stringBuilder));
    }
}
