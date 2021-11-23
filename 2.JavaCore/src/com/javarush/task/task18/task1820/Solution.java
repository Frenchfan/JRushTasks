package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        try (BufferedReader filereader = new BufferedReader(new FileReader(filename1));
        BufferedWriter filewriter = new BufferedWriter(new FileWriter(filename2))) {
            char[] test = new char[1];
            StringBuilder digit = new StringBuilder();
            while (filereader.ready()) {
                filereader.read(test);
                if (test[0] == ' ') {
                    double doubleDigit;
                    doubleDigit = Double.parseDouble(digit.toString());
                    int intDigit = (int) Math.round(doubleDigit);
                    filewriter.write(intDigit + " ");
                    digit = new StringBuilder();
                } else {
                    digit.append(test[0]);
                }
            }
            double doubleDigit;
            doubleDigit = Double.parseDouble(digit.toString());
            int intDigit = (int) Math.round(doubleDigit);
            filewriter.write(intDigit + " ");
        }
    }
}

/*
Округление чисел - решение авторов задачи, обрати внимание на split!!!


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName1));
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileName2))) {

            while (bufferedFileReader.ready()) {
                String[] splittedLine = bufferedFileReader.readLine().split(" ");
                for (String numberInString : splittedLine) {
                    double number = Double.parseDouble(numberInString);
                    long roundedNumber = Math.round(number);
                    printWriter.print(roundedNumber + " ");
                }
            }
        }
    }
}
*/