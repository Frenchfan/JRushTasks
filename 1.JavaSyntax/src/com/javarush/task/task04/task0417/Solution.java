package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/*
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int speedmeter;
        Scanner scanner = new Scanner(System.in);
        speedmeter=scanner.nextInt();
        System.out.println(Math.round(speedmeter*3.6));
    }
}