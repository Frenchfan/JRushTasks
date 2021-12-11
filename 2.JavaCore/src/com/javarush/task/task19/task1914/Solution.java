package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        String[] equation = result.split(" ");
        int digit1 = Integer.parseInt(equation[0]);
        int digit2 = Integer.parseInt(equation[2]);
        int finalResult = 0;
        switch (equation[1]) {
            case ("+"):
                finalResult = digit1 + digit2;
                break;
            case ("-"):
                finalResult = digit1 - digit2;
                break;
            case ("*"):
                finalResult = digit1 * digit2;
        }
        System.setOut(consoleStream);
        System.out.println(result + finalResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

