package com.hillel.homework10;

public class UtilsBuilderString {
    public static StringBuilder createString(int a, int b){
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a-b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a*b).append("\n");

        return result;
    }
    public static StringBuilder changeString(StringBuilder stringBuilder){
        int changes;
        while((changes = stringBuilder.indexOf("=")) !=-1){
            stringBuilder.deleteCharAt(changes);
            stringBuilder.insert(changes, "равно");
        }
        return stringBuilder;
    }
    public static StringBuilder change2String(StringBuilder stringBuilder){
        int changes2;
        while((changes2 = stringBuilder.indexOf("=")) !=-1) {

            stringBuilder.replace(changes2, changes2+1, "равно");
        }
        return stringBuilder;
    }
}

