package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream reader = new FileInputStream(args[0]);
        int counter = 0;
        int spaceCounter = 0;
        while (reader.available() > 0) {
            int mybyte = reader.read();
            counter++;
            if (mybyte == 32) {
                //это код пробела ascii
                spaceCounter++;
            }
        }
        reader.close();
        double proportion = (double) spaceCounter / counter * 100;
        System.out.printf("%.2f", proportion);

    }
}
