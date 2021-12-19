package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> salaries = new TreeMap<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                String[] myLine = fileReader.readLine().split("\\s");
                if (salaries.containsKey(myLine[0])) {
                    double tempsum = salaries.get(myLine[0]);
                    salaries.put(myLine[0], tempsum + Double.parseDouble(myLine[1]));
                } else {
                    salaries.put(myLine[0], Double.parseDouble(myLine[1]));
                }
            }
        }
        for (String s: salaries.keySet()) {
            System.out.println(s + " " + salaries.get(s));
        }
    }
}
