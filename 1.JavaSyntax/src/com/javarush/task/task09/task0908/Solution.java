package com.javarush.task.task09.task0908;

import java.util.regex.Pattern;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {


        if ((binaryNumber == null) || (binaryNumber.equals("")))
            return "";

        else{
            char[] binary = binaryNumber.toCharArray();
            int i = 0;
            while (i < binary.length) {
                if (binary[i] == '\u0030' || binary[i] == '\u0031')
                    i++;
                else
                    return "";
            }
        }
        int c = binaryNumber.length()%4;
        if (c == 1)
            binaryNumber = "0" + "0" + "0" + binaryNumber;
        else if (c == 2)
            binaryNumber = "0" + "0" + binaryNumber;
        else if (c == 3)
            binaryNumber = "0" + binaryNumber;

        String result = "";
        int a = binaryNumber.length();
        int begin = 0;


        while (a > 3){
            int end = begin + 4;
            String temp = binaryNumber.substring(begin, end);
            String temp2 = binaryToHex(temp);
            result = result + temp2;
            begin = end;
            a = a - 4;
        }

        return result;
    }

    //напишите тут ваш код;

    public static String toBinary(String hexNumber) {
        if ((hexNumber == null) || (hexNumber.equals("")))
            return "";//напишите тут ваш код
        else {
            char[] hex = hexNumber.toCharArray();
            int i = 0;
            while (i < hex.length) {
                if (hex[i] == '\u0030' | hex[i] == '\u0031' | hex[i] == '\u0032' | hex[i] == '\u0033' | hex[i] == '\u0034' | hex[i] == '\u0035' | hex[i] == '\u0036' | hex[i] == '\u0037' | hex[i] == '\u0038' | hex[i] == '\u0039' | hex[i] == '\u0061' | hex[i] == '\u0062' | hex[i] == '\u0063' | hex[i] == '\u0064' | hex[i] == '\u0065' | hex[i] == '\u0066')
                    i++;
                else
                    return "";}
        }
        String result = "";
        char[] hex = hexNumber.toCharArray();
        for (int i = 0; i < hex.length; i++){
            result = result + hexToBinary(hex[i]);
        }
        return result;

    }


    public static String binaryToHex(String binaryNumber) {
        if (binaryNumber.equals("0000"))
            return "0";
        else if (binaryNumber.equals("0001"))
            return "1";
        else if (binaryNumber.equals("0010"))
            return "2";
        else if (binaryNumber.equals("0011"))
            return "3";
        else if (binaryNumber.equals("0100"))
            return "4";
        else if (binaryNumber.equals("0101"))
            return "5";
        else if (binaryNumber.equals("0110"))
            return "6";
        else if (binaryNumber.equals("0111"))
            return "7";
        else if (binaryNumber.equals("1000"))
            return "8";
        else if (binaryNumber.equals("1001"))
            return String.valueOf('9');
        else if (binaryNumber.equals("1010"))
            return "a";
        else if (binaryNumber.equals("1011"))
            return "b";
        else if (binaryNumber.equals("1100"))
            return "c";
        else if (binaryNumber.equals("1101"))
            return "d";
        else if (binaryNumber.equals("1110"))
            return "e";
        else if (binaryNumber.equals("1111"))
            return "f";
        else
            return "";
    }

    public static String hexToBinary(char hexNumber) {
        if (hexNumber == '0')
            return "0000";
        else if (hexNumber == '1')
            return "0001";
        else if (hexNumber == '2')
            return "0010";
        else if (hexNumber == '3')
            return "0011";
        else if (hexNumber == '4')
            return "0100";
        else if (hexNumber == '5')
            return "0101";
        else if (hexNumber == '6')
            return "0110";
        else if (hexNumber == '7')
            return "0111";
        else if (hexNumber == '8')
            return "1000";
        else if (hexNumber == '9')
            return "1001";
        else if (hexNumber == 'a')
            return "1010";
        else if (hexNumber == 'b')
            return "1011";
        else if (hexNumber == 'c')
            return "1100";
        else if (hexNumber == 'd')
            return "1101";
        else if (hexNumber == 'e')
            return "1110";
        else if (hexNumber == 'f')
            return "1111";
        else
            return "";
    }
}

