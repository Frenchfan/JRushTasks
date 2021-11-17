package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String filetoRead = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(filetoRead);
            byte[] buffer = new byte[fileInputStream.available()];
            if (buffer.length < 1000)  {
                fileInputStream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
