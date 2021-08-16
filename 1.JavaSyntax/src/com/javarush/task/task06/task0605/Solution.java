package com.javarush.task.task06.task0605;

/*
Правильный порядок
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишите тут ваш код
        int[] temparray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temparray[i]=array[array.length-1-i];
        }
        for (int i = 0; i < temparray.length; i++) {
            array[i]=temparray[i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

