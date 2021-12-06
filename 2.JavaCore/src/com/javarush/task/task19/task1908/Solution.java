package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();
        try (BufferedReader filereader = new BufferedReader(new FileReader(filename1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename2))) {
            while (filereader.ready()) {
                String[] linetoRead = filereader.readLine().split(" ");
                for (int i = 0; i < linetoRead.length; i++) {
                    try {
                        int newnumber = Integer.parseInt(linetoRead[i]);
                        fileWriter.write(newnumber + " ");
                    } catch (NumberFormatException ignored) {
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
