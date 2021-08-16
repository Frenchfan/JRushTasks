package com.javarush.task.task05.task0505;

import java.util.Scanner;

/*
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int[] digits;
        if (N>0) {
            digits=new int[N];
            for (int i = 0; i < N; i++) {
                digits[i]= scanner.nextInt();
            }
            if (N%2==0) {
                for (int i = digits.length-1; i >=0 ; i--) {
                    System.out.println(digits[i]);
                }
            }
            else {
                for (int i = 0; i < (digits.length); i++) {
                    System.out.println(digits[i]);
                }
            }
                }
            }
        }



