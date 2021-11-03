package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String sourceFileName = scanner.nextLine();
        ArrayList<String> linescol = new ArrayList<>();
        String textforFile;
        do {
            textforFile = scanner.nextLine();
            linescol.add(textforFile);
        }while (!textforFile.equals("exit"));
        FileWriter fileWriter = new FileWriter(sourceFileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < linescol.size(); i++) {
            bufferedWriter.write(linescol.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }

}
