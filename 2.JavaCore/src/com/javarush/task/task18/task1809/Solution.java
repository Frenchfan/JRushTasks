package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution  {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filetoRead = reader.readLine();
        String filetoWrite = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filetoRead);
        FileOutputStream outputStream = new FileOutputStream(filetoWrite);
        byte[] buffer = new byte[fileInputStream.available()];
        if (fileInputStream.available() > 0) {
            //читаем файл одним куском
            int count = fileInputStream.read(buffer);
        }
        //Collections.reverse(Arrays.asList(buffer)); как опция
        for (int i = buffer.length - 1; i >= 0; i--) {
            outputStream.write(buffer[i]);
        }
        fileInputStream.close();
        outputStream.close();
    }
}
