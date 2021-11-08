package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeMap;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filetoRead = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filetoRead);
        TreeMap<Integer, Integer> bytes = new TreeMap<>();
        int mybyte;
        int minrepeat = 1;
        while (fileInputStream.available() > 0) {
            mybyte = fileInputStream.read();
            if (bytes.containsKey(mybyte)) {
                int temprepeats = bytes.get(mybyte);
                temprepeats++;
                minrepeat = Math.min(temprepeats, minrepeat);
                bytes.put(mybyte, temprepeats);
            } else {
                bytes.put(mybyte, 1);
            }
        }
        fileInputStream.close();

        for (int key : bytes.keySet()) {
            if (minrepeat == bytes.get(key)) {
                System.out.print(key + " ");
            }
        }
    }
}