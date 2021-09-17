package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/*
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int dig1 = scanner.nextInt();
        int dig2 = scanner.nextInt();
        int dig3 = scanner.nextInt();
        if (dig1==dig2 & dig2==dig3) System.out.println(dig1 +" "+dig2+" "+dig3);
        else if (dig1==dig2) System.out.println(dig1+" "+dig2);
        else if (dig1==dig3) System.out.println(dig1+" "+dig3);
        else if (dig2==dig3) System.out.println(dig2+" "+dig3);
    }
}