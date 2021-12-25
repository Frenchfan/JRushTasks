package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null, new File("D://Java"));
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();

            User myUser = new User();
            myUser.setFirstName("Peter");
            myUser.setLastName("Sumkin");
            myUser.setMale(true);
            myUser.setBirthDate(new Date(84, Calendar.DECEMBER, 1));
            myUser.setCountry(User.Country.RUSSIA);
            javaRush.users.add(myUser);
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            if (javaRush.equals(loadedObject)) {
                System.out.println("Success");
            } else {
                for (User user: loadedObject.users) {
                    System.out.println(user.getFirstName());
                    System.out.println(user.getLastName());
                    System.out.println(user.isMale());
                    System.out.println(user.getBirthDate());
                    System.out.println(user.getCountry());
                }
            }
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);
            if (this.users != null) {
                printWriter.println("HasElements");
                printWriter.println(this.users.size());
                for (int i = 0; i < this.users.size(); i++) {
                    printWriter.println(this.users.get(i).getFirstName());
                    printWriter.println(this.users.get(i).getLastName());
                    printWriter.println(this.users.get(i).isMale());
                    printWriter.println(this.users.get(i).getBirthDate().getTime());
                    printWriter.println(this.users.get(i).getCountry());
                }
            } else {
                printWriter.println("Empty");
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                while (reader.ready()) {
                    if (reader.readLine().equals("HasElements")) {
                        int counter = Integer.parseInt(reader.readLine());
                        for (int i = 0; i < counter; i++) {
                            User myUser = new User();
                            myUser.setFirstName(reader.readLine());
                            myUser.setLastName(reader.readLine());
                            myUser.setMale(reader.readLine().equals("true"));
                            Date myDate = new Date(Long.parseLong(reader.readLine()));
                            myUser.setBirthDate(myDate);
                            String country = reader.readLine();
                            if (country.equals("RUSSIA")) {
                                myUser.setCountry(User.Country.RUSSIA);
                            } else if (country.equals("UKRAINE")) {
                                myUser.setCountry(User.Country.UKRAINE);
                            } else if (country.equals("OTHER")) {
                                myUser.setCountry(User.Country.OTHER);
                            }
                            this.users.add(myUser);
                        }
                    } else {
                        this.users = null;
                    }
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
