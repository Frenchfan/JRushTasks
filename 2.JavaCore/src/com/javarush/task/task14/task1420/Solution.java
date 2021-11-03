package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstdigit = Integer.parseInt(reader.readLine());
        int seconddigit = Integer.parseInt(reader.readLine());
        System.out.println(maxcommondiviser(firstdigit, seconddigit));
    }

    private static int maxcommondiviser(int firstdigit, int seconddigit) {
        int min = Math.min(firstdigit, seconddigit);
        for (int i = min; i > 0; i--) {
            if (firstdigit % i == 0 && seconddigit % i == 0) {
                return i;
            }
        }
        return 0;
    }
}
