package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
            ArrayList<String> myList = new ArrayList<>();
            while (fileReader.ready()) {
                String[] myLine = fileReader.readLine().split(" ");
                for (String word: myLine) {
                    if (word.length() > 6) {
                        myList.add(word);
                    }
                }
            }
            for (int i = 0; i < myList.size() - 1; i++) {
                fileWriter.write(myList.get(i));
                fileWriter.write(",");
            }
            fileWriter.write(myList.get(myList.size() - 1));
        }
    }
}
