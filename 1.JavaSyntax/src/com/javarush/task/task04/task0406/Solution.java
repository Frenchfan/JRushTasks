package com.javarush.task.task04.task0406;

import java.util.Scanner;

/*
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String line;
        while (true) {
            line = scanner.nextLine();
            if (line.equals("enough")) break;
            System.out.println(line);
        }
    }
}