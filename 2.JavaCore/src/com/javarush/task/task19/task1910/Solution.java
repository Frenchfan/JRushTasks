package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = consoleReader.readLine();
        String fileName2 = consoleReader.readLine();
        consoleReader.close();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
            while (fileReader.ready()) {
                String linetoRead = fileReader.readLine().replaceAll("\\p{Punct}", "");
                fileWriter.write(linetoRead);
            }
        }
    }
}
