package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        switch (args[0]) {
            case "-c":
                for (int i = 1; i < args.length - 2; i += 3) {
                    synchronized (allPeople) {
                            if ("м".equals(args[i + 1])) {
                                    try {
                                        allPeople.add(Person.createMale(args[i],
                                                new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                                    } catch (ParseException e) {
                                        e.printStackTrace();
                                    }
                            } else if ("ж".equals(args[i + 1])) {
                                    try {
                                        allPeople.add(Person.createFemale(args[i],
                                                new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                                    } catch (ParseException e) {
                                        e.printStackTrace();
                                    }
                            }
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {

                            Person ps = allPeople.get(Integer.parseInt(args[i]));
                            String newsex = (ps.getSex() == Sex.MALE) ? "м" : "ж";
                            System.out.println(ps.getName() + " " + newsex + " " + new SimpleDateFormat(
                                    "dd-MMM-yyyy", Locale.ENGLISH).format(ps.getBirthDate()));

                    }

                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length - 3; i += 4) {
                            int index = Integer.parseInt(args[i]);
                                    try {
                                        allPeople.get(index).setName(args[i + 1]);
                                        allPeople.get(index).setSex("м".equals(args[i + 2]) ? Sex.MALE : Sex.FEMALE);
                                        allPeople.get(index).setBirthDate(
                                                    new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 3]));
                                    } catch (ParseException e) {
                                        e.printStackTrace();
                                    }
                            }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                                Person emp = allPeople.get(Integer.parseInt(args[i]));
                                emp.setName(null);
                                emp.setSex(null);
                                emp.setBirthDate(null);
                                allPeople.set(Integer.parseInt(args[i]), emp);
                    }
                }
                break;
        }
    }
}
