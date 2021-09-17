package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/*
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int dig1, dig2;
        double result;
        Scanner scanner = new Scanner(System.in);
        dig1=scanner.nextInt();
        dig2=scanner.nextInt();
        result = dig1*1.0/dig2;
        System.out.println(result);
    }
}