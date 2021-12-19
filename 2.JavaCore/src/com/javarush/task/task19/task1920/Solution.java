package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        TreeMap<String, Double> incomes = new TreeMap<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                String[] myLine = fileReader.readLine().split("\\s");
                String name = myLine[0];
                Double income = Double.parseDouble(myLine[1]);
                if (incomes.containsKey(name)) {
                    double temp = incomes.get(name);
                    incomes.put(name, temp + income);
                } else {
                    incomes.put(name, income);
                }
            }

            double maxIncome = incomes.firstEntry().getValue();
            for (double value: incomes.values()) {
                if (value > maxIncome) {
                    maxIncome = value;
                }
            }

            TreeSet<String> names = new TreeSet<>();
            for (String name : incomes.keySet()) {
                if (maxIncome == incomes.get(name)) {
                    names.add(name);
                }
            }

            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
