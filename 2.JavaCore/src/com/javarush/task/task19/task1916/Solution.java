package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        ArrayList<String> file1List = new ArrayList<>();
        ArrayList<String> file2List = new ArrayList<>();
        try (BufferedReader fileReader1 = new BufferedReader(new FileReader(file1));
             BufferedReader fileReader2 = new BufferedReader(new FileReader(file2))) {
            while (fileReader1.ready()) {
                file1List.add(fileReader1.readLine());
            }
            while (fileReader2.ready()) {
                file2List.add(fileReader2.readLine());
            }
        }
        int counter1 = 0, counter2 = 0;
        while (counter1 < file1List.size() && counter2 < file2List.size()) {
            if (file1List.get(counter1).equals(file2List.get(counter2))) {
                lines.add(new LineItem(Type.SAME, file1List.get(counter1)));
                counter1++;
                counter2++;
            } else if (counter2 + 1 < file2List.size() && file1List.get(counter1).equals(file2List.get(counter2 + 1))) {
                lines.add(new LineItem(Type.ADDED, file2List.get(counter2)));
                counter2++;
            } else if (counter1 + 1 < file1List.size() && file1List.get(counter1 + 1).equals(file2List.get(counter2))) {
                lines.add(new LineItem(Type.REMOVED, file1List.get(counter1)));
                counter1++;
            }
        }

        while (counter1 < (file1List.size())) {
            lines.add(new LineItem(Type.REMOVED, file1List.get(counter1)));
            counter1++;
        }
        while (counter2 < (file2List.size())) {
            lines.add(new LineItem(Type.ADDED, file2List.get(counter2)));
            counter2++;
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
