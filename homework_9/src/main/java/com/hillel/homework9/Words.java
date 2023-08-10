package com.hillel.homework9;

public class Words {
    public static void main(String args[]) {
        String str = "fffff ab f 1234 jkjk";
        String[] words = str.split(" ");

        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            int matchWord = countMax(words[i].toCharArray());
            if (matchWord < maxCount) {
                maxCount = matchWord;
                index = i;
            }
        }
        System.out.println(words[index]);
    }

    private static int countMax (char[] array){
        int maxcount = 0;
        for (int i = 0; i < array.length; ++i) {
            int currentLetterCount = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    currentLetterCount++;
                }
            }
            if (currentLetterCount > maxcount) {
                    maxcount = currentLetterCount;
            }
        }
        return array.length - maxcount;
    }
}


