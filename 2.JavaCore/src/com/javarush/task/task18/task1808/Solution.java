package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filetoRead = reader.readLine();
        String filetoWritepart1 = reader.readLine();
        String filetoWritepart2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filetoRead);
        FileOutputStream outputStream = new FileOutputStream(filetoWritepart1);
        if (fileInputStream.available() > 0) {
            //читаем половину файла одним куском
            byte[] buffer = new byte[(int) ((fileInputStream.available() + 1.0) / 2.0)];
            int count = fileInputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }
        FileOutputStream outputStream2 = new FileOutputStream(filetoWritepart2);
        if (fileInputStream.available() > 0) {
            //читаем вторую половину файла одним куском
            byte[] buffer = new byte[fileInputStream.available()];
            int count = fileInputStream.read(buffer);
            outputStream2.write(buffer, 0, count);
        }
        fileInputStream.close();
        outputStream.close();
        outputStream2.close();
    }
}
