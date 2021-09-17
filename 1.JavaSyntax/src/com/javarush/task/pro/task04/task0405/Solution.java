package com.javarush.task.pro.task04.task0405;

/*
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int width = 0, height = 0;
        while (height < 10) {
            while (height == 0 || height == 9) {
                while (width < 20) {
                    System.out.print("Б");
                    width++;
                }
                System.out.println();
                height++;
                width = 0;
                while (height > 0 && height < 9) {
                    while (width < 20) {
                        while (width == 0 || width == 19) {
                            System.out.print("Б");
                            width++;
                        }
                        width++;
                        System.out.print(" ");
                    }
                    System.out.println();
                    height++;
                    width = 0;
                }
            }
        }
    }
}