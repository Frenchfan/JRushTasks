package com.javarush.task.task04.task0414;

import java.util.Scanner;

/*
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int number, counter=0;
        String line;
        Scanner scanner = new Scanner(System.in);
        line=scanner.nextLine();
        number=scanner.nextInt();
        do {
            System.out.println(line);
            counter++;
            if (number<=0 || number >=5) break;
        }
        while (counter<number);
    }
}
