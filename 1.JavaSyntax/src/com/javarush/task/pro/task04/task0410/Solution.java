package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int min=Integer.MAX_VALUE, minplus=Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int s=scanner.nextInt();
            if (s<min) {
                minplus=min;
                min=s;
            }
            else if (s<minplus && s>min) minplus=s;
        }
        System.out.println(minplus);
    }
}