package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/*
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean stopcycle = false;
        int sum = 0;
        while (!stopcycle) {
            String digit = scanner.nextLine();
            try {
                sum = sum + Integer.parseInt(digit);
            }
            catch (NumberFormatException nfe) {
                if (digit.equals("ENTER")) {
                    stopcycle = true;
                    System.out.println(sum);
                }
            }

        }
    }
}