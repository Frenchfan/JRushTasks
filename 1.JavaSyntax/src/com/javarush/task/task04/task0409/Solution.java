package com.javarush.task.task04.task0409;

import java.util.Scanner;

/*
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int min=Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int s=scanner.nextInt();
            if (s<min) min=s;
        }
        System.out.println(min);
    }
}
