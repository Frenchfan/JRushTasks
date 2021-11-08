package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filetoRead = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filetoRead);
        int maxbyte = 0;
        while (fileInputStream.available() > 0) {
            int tempbyte = fileInputStream.read();
            if (tempbyte > maxbyte) {
                maxbyte = tempbyte;
            }
        }
        fileInputStream.close();
        System.out.println(maxbyte);
    }
}
