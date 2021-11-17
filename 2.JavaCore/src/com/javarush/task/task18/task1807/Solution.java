package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filetoRead = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filetoRead);
        int mybyte;
        final char repeats = ',';
        int howmany = 0;
        while (fileInputStream.available() > 0) {
            mybyte = fileInputStream.read();
            if (mybyte == repeats) {
                howmany++;
            }
        }
        fileInputStream.close();
        System.out.println(howmany);
    }
}
