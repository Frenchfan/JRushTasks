package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/*
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишите тут ваш код
        Path adr1 = Path.of(str1);
        Path adr2 = Path.of(str2);
        try{
        System.out.println(adr1.relativize(adr2));
        } catch (Exception e) {
            try {
                System.out.println(adr2.relativize(adr1));
            }catch (Exception f) {
            }
        }
    }
}