package com.javarush.task.task03.task0308;

import java.util.Scanner;

/*
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int coorX = scanner.nextInt();
        int coorY = scanner.nextInt();
        if (coorX>0 && coorY>0) System.out.println(1);
        else if (coorX<0 && coorY>0) System.out.println(2);
        else if (coorX<0 && coorY<0) System.out.println(3);
        else if (coorX>0 && coorY<0) System.out.println(4);
    }
}
