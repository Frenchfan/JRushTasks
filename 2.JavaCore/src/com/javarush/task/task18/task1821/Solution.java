package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream array = new ByteArrayOutputStream();
        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(args[0]))) {
            while (reader.available() > 0) {
                array.write(reader.read());
            }
        }
        byte[] modifiedarray = array.toByteArray();
        TreeMap<Byte, Integer> symbols = new TreeMap<>();
        for (byte currentByte : modifiedarray) {
            if (symbols.containsKey(currentByte)) {
                int tempFrequency = symbols.get(currentByte);
                tempFrequency++;
                symbols.put(currentByte, tempFrequency);
            } else {
                symbols.put(currentByte, 1);
            }
        }
        for (byte currentByte: symbols.keySet()) {
            System.out.print((char) currentByte + " " + symbols.get(currentByte));
            System.out.println();
        }
    }
}

/*
package com.javarush.task.task18.task1821;

        import java.io.FileReader;
        import java.io.IOException;


Встречаемость символов


/* Очень элегантное решение с массивом, юбез всяких map. Индекс массива - aSCII код символа, инкрементация -
содержимое ячейки массива.
Емкость массива 128, поскольку используются только английский алфавит и спец символы, с русскими было бы сложнее...
public class Solution {
    public static void main(String[] args) throws IOException {
        int[] aSCII = new int[128];
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                aSCII[reader.read()]++;
            }
        }
        for (int i = 0; i < aSCII.length; i++) {
            if (aSCII[i] != 0) {
                System.out.println((char) i + " " + aSCII[i]);
            }
        }
    }
}*/
