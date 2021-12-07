package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();
        try (BufferedReader filereader = new BufferedReader(new FileReader(filename1));
        BufferedWriter filewriter = new BufferedWriter(new FileWriter(filename2))) {
            while (filereader.ready()) {
                String linetoRead = filereader.readLine().replaceAll("\\.", "!");
                filewriter.write(linetoRead);
            }
        }
    }
}
