package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Алгоритмы-числа
*/

public class Solution {

    public static long[] getNumbers(long N) {
        if (N < 1) {
            return new long[0];
        }
        ArrayList<Long> myResult = new ArrayList<>();
        for (long i = 1; i < N; i++) {
            String myChar = String.valueOf(i);
            long mySum = 0;
            for (int j = 0; j < myChar.length(); j++) {
                mySum += Math.pow(Character.getNumericValue(myChar.charAt(j)), myChar.length());
                }
            if (i == mySum) {
                myResult.add(i);
            }
        }
        long[] result = myResult.stream()
                .mapToLong(Long::valueOf)
                .toArray();
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
