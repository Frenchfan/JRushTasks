package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filetoRead = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filetoRead);
        TreeMap<Integer, Integer> bytes = new TreeMap<>();
        int mybyte;
        while (fileInputStream.available() > 0) {
            mybyte = fileInputStream.read();
            if (!bytes.containsKey(mybyte)) {
                bytes.put(mybyte, 1);
            }
        }
        fileInputStream.close();
        for (int key : bytes.keySet()) {
                System.out.print(key + " ");
        }
    }
}
