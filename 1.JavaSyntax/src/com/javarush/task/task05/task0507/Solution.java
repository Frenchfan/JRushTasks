package com.javarush.task.task05.task0507;

import java.util.Scanner;

/*
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt(), max;
        array=new int[N];
        for (int i = 0; i < N; i++) {
            array[i]=scanner.nextInt();
        }
        max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max) max=array[i];
        }
        System.out.println(max);
    }
}
