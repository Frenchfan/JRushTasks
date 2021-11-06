package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String fileName1 = reader.readLine();
                String fileName2 = reader.readLine();
                reader = new BufferedReader(new FileReader(fileName1));
                while (reader.ready()) {
                    allLines.add(reader.readLine());
                }
                reader.close();
                reader = new BufferedReader(new FileReader(fileName2));
                while (reader.ready()) {
                    forRemoveLines.add(reader.readLine());
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Solution solution = new Solution();
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {

        boolean condition = false;
        if (allLines.containsAll(forRemoveLines)) { //Метод containsAll проверяет на наличие всех строк Б в файле А
            allLines.removeAll(forRemoveLines); //Метод removeAll убирает все строки Б из А
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
