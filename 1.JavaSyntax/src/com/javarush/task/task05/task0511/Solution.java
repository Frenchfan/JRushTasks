package com.javarush.task.task05.task0511;

import java.util.Scanner;

/*
Создаем двухмерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        multiArray=new int[N][];
        for (int i = 0; i < multiArray.length; i++) {
            N= scanner.nextInt();
            multiArray[i]=new int[N];
        }
    }
}
