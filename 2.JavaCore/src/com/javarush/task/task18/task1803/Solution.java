package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

/* 
Самые частые байты
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filetoRead = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filetoRead);
        TreeMap<Integer, Integer> bytes = new TreeMap<>();
        int mybyte;
        int maxrepeat = 1;
        while (fileInputStream.available() > 0) {
            mybyte = fileInputStream.read();
            if (bytes.containsKey(mybyte)) {
                int temprepeats = bytes.get(mybyte);
                temprepeats++;
                maxrepeat = Math.max(temprepeats, maxrepeat);
                bytes.put(mybyte, temprepeats);
            } else {
                bytes.put(mybyte, 1);
            }
        }
        fileInputStream.close();

        for (int key : bytes.keySet()) {
            if (maxrepeat == bytes.get(key)) {
                System.out.print(key + " ");
            }
        }

        /*System.out.println();// на будущее
        bytes.entrySet().stream().
                sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
    /*public static void main(String[] args) throws Exception { // правильное решение
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int[] byteCountArray = new int[256];
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                byteCountArray[fileInputStream.read()] += 1;
            }
        }
        int maxCount = 0;
        for (int byteCount : byteCountArray) {
            if (byteCount > maxCount) maxCount = byteCount;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == maxCount) resultList.add(i);
        }
        for (Integer resultItem : resultList) System.out.print(resultItem + " ");
    }*/
    }
}


