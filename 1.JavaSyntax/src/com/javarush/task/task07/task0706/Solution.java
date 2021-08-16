package com.javarush.task.task07.task0706;

/*
Странное деление
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        div(1d/0d,1d/0d);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}

