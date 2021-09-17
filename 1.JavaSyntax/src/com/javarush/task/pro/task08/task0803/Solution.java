package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/*
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int min1 = Math.min(Math.min(ints[0],ints[1]),Math.min(ints[2],ints[3]));
        int min2 = Math.min(Math.min(ints[4],ints[5]),Math.min(ints[6],ints[7]));
        int min3 = Math.min(ints[8],ints[9]);
        return Math.min(Math.min(min1,min2),min3);
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i]=scanner.nextInt();
        }
        return array;
    }

}