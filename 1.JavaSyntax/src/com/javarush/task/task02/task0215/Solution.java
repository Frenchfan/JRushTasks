package com.javarush.task.task02.task0215;

import java.util.Scanner;

/*
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int digit1 = scanner.nextInt();
        int digit2 = scanner.nextInt();
        int digit3 = scanner.nextInt();
        System.out.println((digit1+digit2+digit3)/3);

    }
}
