package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String[] params = url.split("\\?");
        String[] params2 = params[1].split("&");
        String insteadDouble = "";
        byte flag = 0;
        double forDouble = 0.0;
        for (int i = 0; i < params2.length; i++) {
            String[] params3 = params2[i].split("=");
            System.out.print(params3[0] + " ");
            if (params3[0].equals("obj")) {
                try {
                    forDouble = Double.parseDouble(params3[1]);
                    flag = 1;
                } catch (NumberFormatException e) {
                    insteadDouble = params3[1];
                    flag = 2;
                }
            }
        }
        if (flag == 1) {
            System.out.println();
            alert(forDouble);
        } else if (flag == 2) {
            System.out.println();
            alert(insteadDouble);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
