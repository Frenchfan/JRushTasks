package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings=new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i]=scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String deleting = strings[i];
            for (int j = 0; j < strings.length; j++) {
                if (i!=j && strings[i]!=null && strings[j]!=null && strings[j].equals(deleting)) {
                    strings[i]=strings[j]=null;
                    for (int k = 0; k < strings.length; k++) {
                        if (strings[k]!=null && strings[k].equals(deleting)) strings[k]=null;
                    }
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}