package com.javarush.task.task09.task0907;

import java.util.regex.Pattern;

/*
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        if (decimalNumber<=0) return "";
        String hexNumber="";
        while (decimalNumber!=0) {
            hexNumber=HEX.charAt(decimalNumber%16)+hexNumber;
            decimalNumber=decimalNumber/16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        int decimalNumber = 0;
        if ((hexNumber != null)&&(hexNumber != ""))
        {
            for(int i = 0;i < hexNumber.length();i++){
                int index = 0;
                for(int ind = 0;ind < HEX.length();ind++){
                    if(HEX.split("")[ind].equals(hexNumber.split("")[i])) index = ind;
                }
                decimalNumber = 16 * decimalNumber + index;
            }
            return decimalNumber;
        }
        else return 0;
    }

}
