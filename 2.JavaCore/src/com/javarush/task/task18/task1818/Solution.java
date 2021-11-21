package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename1));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(filename2));
        BufferedReader fileReader3 = new BufferedReader(new FileReader(filename3));
        String buffer;
        while (fileReader2.ready()) {
            buffer = fileReader2.readLine();
            fileWriter.write(buffer);
        }
        fileReader2.close();
        while (fileReader3.ready()) {
            buffer = fileReader3.readLine();
            fileWriter.write(buffer);
        }
        fileReader3.close();
        fileWriter.close();
    }
}
