package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.5, "test1");
        labels.put(4D, "test2");
        labels.put(88.1, "test3");
        labels.put(76.1, "test4");
        labels.put(82.7, "test5");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
