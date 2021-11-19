package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        String newLine;
        ArrayList<Pricedatabase> fileContent = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(filename));
        if (args.length == 0) {
            return;
        }
        String curId = String.format("%-8s", args[1]);
        while (fileReader.ready()) {
            String test = fileReader.readLine();
            fileContent.add(new Pricedatabase(Integer.parseInt(test.substring(0, 8).trim()), test.substring(8)));
        }
        for (Pricedatabase p: fileContent) {
            System.out.println(p.getId() + p.getTherest());
        }
        fileReader.close();
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename));

        if ("-u".equals(args[0])) {
            args[2] = String.format("%-30s", args[2]);
            args[3] = String.format("%-8s", args[3]);
            args[4] = String.format("%-4s", args[4]);
            newLine = curId + args[2] + args[3] + args[4];
            fileReader.close();

            for (Pricedatabase p: fileContent) {
                if (p.getId() == Integer.parseInt(curId.trim())) {
                    fileWriter.write(newLine + "\n");
                } else {
                    fileWriter.write(p.getId() + p.getTherest() + "\n");
                }
            }
        } else if ("-d".equals(args[0])) {
            for (Pricedatabase p: fileContent) {
                if (p.getId() != Integer.parseInt(curId.trim())) {
                    fileWriter.write(p.getId() + p.getTherest() + "\n");
                }
            }
        }
        fileWriter.close();
    }
}
