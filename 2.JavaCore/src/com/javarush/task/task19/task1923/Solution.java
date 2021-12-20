package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        String fileName2 = args[1];
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
            while (fileReader.ready()) {
                String[] lines = fileReader.readLine().split(" ");
                for (String line: lines) {
                    if (line.matches(".*\\d.*")) {
                        fileWriter.write(line + " ");
                    }
                }
            }
        }
    }
}
