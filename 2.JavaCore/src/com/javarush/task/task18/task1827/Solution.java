package com.javarush.task.task18.task1827;

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
        int currentMax = 0;
        String newLine;
        ArrayList<Pricedatabase> fileContent = new ArrayList<>();
        if (args.length == 0) {
            return;
        } else if ("-c".equals(args[0])) {
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename, true));
            while (fileReader.ready()) {
                String test = fileReader.readLine();
                fileContent.add(new Pricedatabase(Integer.parseInt(test.substring(0, 8).trim()), test.substring(9)));
            }
            for (Pricedatabase s: fileContent) {
                currentMax = Math.max(currentMax, s.getId());
            }
            currentMax++;
            String curMax = String.format("%-8s", currentMax);
            args[1] = String.format("%-30s", args[1]);
            args[2] = String.format("%-8s", args[2]);
            args[3] = String.format("%-4s", args[3]);
            fileWriter.write("\n");
            newLine = curMax + args[1] + args[2] + args[3] + "\n";
            fileWriter.write(newLine);
            fileReader.close();
            fileWriter.close();
        }
    }
}
