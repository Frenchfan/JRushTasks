package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> files = new TreeSet<>((o1, o2) -> {
            String[] parts1 = o1.split(".part");
            String[] parts2 = o2.split(".part");
            int number1 = Integer.parseInt(parts1[parts1.length - 1]);
            int number2 = Integer.parseInt(parts2[parts2.length - 1]);
            return number1 - number2;
        });
        String currentFile = "";
        while (!(currentFile = reader.readLine()).equals("end")) {
                files.add(currentFile);
        }
        String[] bNames = files.toArray(new String[0]);
        String[] names = bNames[0].split("\\.");
        String newName = names[0] + "." + names[1];
        for (String s: files) {
            System.out.println(s);
        }
        try (FileOutputStream filewriter = new FileOutputStream(newName)) {
            for (String file : files) {
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    byte[] buffer = new byte[fileInputStream.available()];
                    while (fileInputStream.available() > 0) {
                        int bytesRead = fileInputStream.read(buffer);
                        filewriter.write(buffer, 0, bytesRead);
                    }
                }
            }
        }
    }
}
