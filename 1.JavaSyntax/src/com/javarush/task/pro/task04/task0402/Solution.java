package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/*
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        int n=0;
        while (n<10) {
            System.out.println(name1+text);
            n++;}
    }
}