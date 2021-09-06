package com.javarush.task.pro.task17.task1708;

/*
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код
    public static int min (int a, int b) {
        return (a<b)? a: b;
    }
    public static int min (int a, int b, int c) {
        int d= min(a,b);
        return (c < d) ? c : d;
    }

    public static int min (int a, int b, int c, int d) {
        int e= min(a,b);
        int f= min(c,d);
        return (e < f) ? e : f;
    }
    public static int min (int a, int b, int c, int d, int e) {
        int f= min(a,b);
        int g= min(c,d);
        int h = min(f,g);
        return (h < e) ? h : e;
    }
    public static int max (int a, int b) {
        return (a>b)? a: b;
    }
    public static int max (int a, int b, int c) {
        int d= max(a,b);
        return (c > d) ? c : d;
    }

    public static int max (int a, int b, int c, int d) {
        int e= max(a,b);
        int f= max(c,d);
        return (e > f) ? e : f;
    }
    public static int max (int a, int b, int c, int d, int e) {
        int f= max(a,b);
        int g= max(c,d);
        int h = max(f,g);
        return (h > e) ? h : e;
    }
}