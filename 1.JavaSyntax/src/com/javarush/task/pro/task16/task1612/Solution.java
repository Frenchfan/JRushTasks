package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/*
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишите тут ваш код
        HashSet<LocalDateTime> localDateTimes = new HashSet<>();
        for (LocalDate date: sourceMap.keySet()) {
            List<LocalTime> value = sourceMap.get(date);
            for (int i = 0; i < value.size(); i++) {
                localDateTimes.add(LocalDateTime.of(date,value.get(i)));
            }
        }
        return localDateTimes;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}