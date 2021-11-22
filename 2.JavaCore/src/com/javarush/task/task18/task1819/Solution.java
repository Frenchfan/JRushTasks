package com.javarush.task.task18.task1819;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream fileInputStream1 = new FileInputStream(filename1);
        FileInputStream fileInputStream2 = new FileInputStream(filename2)) {
            while (fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
        /*List<String> lines = new ArrayList<>();
        BufferedReader filereader = new BufferedReader(new FileReader(filename1));
        BufferedReader filereader2 = new BufferedReader(new FileReader(filename2));
        while (filereader2.ready()) {
            lines.add(filereader2.readLine());
        }
        while (filereader.ready()) {
            lines.add(filereader.readLine());
        }
        filereader.close();
        filereader2.close();
        BufferedWriter filewriter = new BufferedWriter(new FileWriter(filename1));
        for (String line: lines) {
            filewriter.write(line);
        }
        filewriter.close();*/

    }
}
