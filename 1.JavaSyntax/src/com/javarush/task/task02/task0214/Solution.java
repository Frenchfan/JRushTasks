package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/*
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
    Scanner scanner = new Scanner(System.in);
    String line1 = scanner.nextLine();
    String line2 = scanner.nextLine();
    String line3 = scanner.nextLine();
    System.out.println(line3);
    System.out.println(line2.toUpperCase());
    System.out.println(line1.toLowerCase());
    }
}