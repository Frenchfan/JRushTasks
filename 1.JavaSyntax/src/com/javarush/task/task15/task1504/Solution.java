package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String pathsource, pathdest;
        int firstbyte, secondbyte;
        //System.out.println("Введите адрес файла-источника");
        pathsource = scanner.nextLine();
        //System.out.println("Введите адрес файла-назначения");
        pathdest = scanner.nextLine();
        try (InputStream inputstream =  Files.newInputStream(Paths.get(pathsource));
             OutputStream outputstream = Files.newOutputStream(Paths.get(pathdest)))
        {while (inputstream.available()>0) {
            firstbyte = inputstream.read();
            if (inputstream.available()>0) {
                secondbyte=inputstream.read();
                outputstream.write(secondbyte);
                outputstream.write(firstbyte);
            } else {
                outputstream.write(firstbyte);
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}