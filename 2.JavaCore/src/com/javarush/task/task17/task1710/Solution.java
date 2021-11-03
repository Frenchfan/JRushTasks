package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        switch (args[0]) {
            case "-c":
                if ("м".equals(args[2])) {
                    try {
                        allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                } else if ("ж".equals(args[2])) {
                    try {
                        allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(allPeople.size() - 1);
                break;
            case "-r":
                Person ps = allPeople.get(Integer.parseInt(args[1]));
                String newsex = (ps.getSex() == Sex.MALE) ? "м" : "ж";
                System.out.println(ps.getName() + " " + newsex + " " + new SimpleDateFormat(
                        "dd-MMM-yyyy", Locale.ENGLISH).format(ps.getBirthDate()));
                break;
            case "-u":
                int index = Integer.parseInt(args[1]);
                allPeople.get(index).setName(args[2]);
                allPeople.get(index).setSex("м".equals(args[3]) ? Sex.MALE : Sex.FEMALE);
                try {
                    allPeople.get(index).setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(args[4]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case "-d":
                Person emp = allPeople.get(Integer.parseInt(args[1]));
                emp.setName(null);
                emp.setSex(null);
                emp.setBirthDate(null);
                allPeople.set(Integer.parseInt(args[1]), emp);
                break;
            default:
                break;
        }

    }
}
