package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] values = JavarushQuest.values();
        for (JavarushQuest value: values) {
            System.out.println(value.ordinal());
        }
    }
}