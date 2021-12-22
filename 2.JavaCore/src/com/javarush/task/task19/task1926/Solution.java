package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                String myLine = fileReader.readLine();
                StringBuilder reversedLine = new StringBuilder();
                for (int i = myLine.length() - 1; i >= 0; i--) {
                    reversedLine.append(myLine.charAt(i));
                }
                System.out.println(reversedLine);
            }
        }
    }
}
