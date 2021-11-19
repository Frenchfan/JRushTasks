package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream reader = new FileInputStream(args[0]);
        int counter = 0;
        while (reader.available() > 0) {
            int mybyte = reader.read();
            if (mybyte >= 65 && mybyte <= 90 || mybyte >= 97 && mybyte <= 122) {
                //это код ascii символов английского алфавита
                counter++;
            }
        }
        reader.close();
        System.out.println(counter);
    }
}
