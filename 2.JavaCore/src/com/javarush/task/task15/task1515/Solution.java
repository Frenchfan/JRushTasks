package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;



    static {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            A = Integer.parseInt(in.readLine());

            B = Integer.parseInt(in.readLine());
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static final int MIN = min(A, B);
    //Важно, чтобы константа MIN была после инициализации (static) A и B в коде, иначе она нулевая

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
