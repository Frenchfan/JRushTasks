package com.javarush.task.task04.task0404;

/*
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int width = 0, height = 0;
        while (height < 5) {
            while (width < 10) {
                System.out.print("Q");
                width++;
            }
            width=0;
            System.out.println();
            height++;
        }
    }
}
