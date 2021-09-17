package com.javarush.task.pro.task12.task1206;

/*
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }


    public static int countDigits(String string) {
        //напишите тут ваш код
        int counterDigits=0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) counterDigits++;
        }
        return counterDigits;
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        int counterLetters=0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isAlphabetic(string.charAt(i))) counterLetters++;
        }
        return counterLetters;
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        int counterSpaces=0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) counterSpaces++;
        }
        return counterSpaces;
    }
}