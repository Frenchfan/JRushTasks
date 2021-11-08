package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filetoRead = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filetoRead);
        int minbyte = fileInputStream.read();
        while (fileInputStream.available() > 0) {
            int tempbyte = fileInputStream.read();
            if (tempbyte < minbyte) {
                minbyte = tempbyte;
            }
        }
        fileInputStream.close();
        System.out.println(minbyte);
    }
}
