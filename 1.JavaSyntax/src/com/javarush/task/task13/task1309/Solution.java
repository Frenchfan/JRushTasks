package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/*
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Иванов", 4.7);
        grades.put("Петров", 4.9);
        grades.put("Сидоров", 4.7);
        grades.put("Богатов", 4.4);
        grades.put("Акакий", 3.7);
    }
}