package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/*
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double pi=3.14;
        int radius, square;
        Scanner scanner = new Scanner(System.in);
        radius=scanner.nextInt();
        if (radius>0) {
            square=(int)(pi*radius*radius);
            System.out.println(square);
        }
    }
}