package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        try (BufferedReader filereader = new BufferedReader(new FileReader(filename))) {
            while (filereader.ready()) {
                String newLine = filereader.readLine();
                String[] productInfo = newLine.split(" ");
                if (productInfo[0].equals(args[0])) {
                    System.out.println(newLine);
                    break;
                }
            }
        }

    }
}




