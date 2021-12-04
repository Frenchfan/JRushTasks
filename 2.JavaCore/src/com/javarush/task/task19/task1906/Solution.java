package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();
        try (FileReader reader1 = new FileReader(filename1);
             FileWriter writer2 = new FileWriter(filename2)) {
            while (reader1.ready()) {
                int firstChar = reader1.read();
                int secondChar = reader1.read();
                writer2.write(secondChar);
            }
        }
    }
}
