package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        ArrayList<Integer> listofLines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            listofLines.add(Integer.parseInt(scanner.nextLine()));
        }
        Collections.sort(listofLines);
        for (int number: listofLines)
            if (number%2==0) System.out.println(number);

        scanner.close();
        reader.close();
    }
}
