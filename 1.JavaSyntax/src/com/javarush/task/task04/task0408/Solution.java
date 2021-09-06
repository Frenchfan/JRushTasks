package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/*
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int max=Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int s=scanner.nextInt();
            if (s>max && s%2==0) max=s;
        }
        System.out.println(max);
    }
}