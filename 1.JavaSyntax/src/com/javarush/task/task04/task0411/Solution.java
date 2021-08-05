package com.javarush.task.task04.task0411;

/*
Четные числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i <16 ; i++) {
            if (i%2!=0) continue;
            System.out.println(i);
        }
    }
}

