package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
        byte[] buffer = new byte[1000];
        int key = 5;
        if ("-e".equals(args[0])) {
            while (fileInputStream.available() > 0) {
                // пока есть еще непрочитанные байты прочитать очередной блок байт в переменную buffer и реальное
                int count = fileInputStream.read(buffer);
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] += key;
                }
                fileOutputStream.write(buffer, 0, count); //записать блок(часть блока) во второй поток
            }
        } else if ("-d".equals(args[0])) {
            while (fileInputStream.available() > 0) {
                // пока есть еще непрочитанные байты прочитать очередной блок байт в переменную buffer и реальное
                int count = fileInputStream.read(buffer);
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] -= key;
                }
                fileOutputStream.write(buffer, 0, count); //записать блок(часть блока) во второй поток
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}
