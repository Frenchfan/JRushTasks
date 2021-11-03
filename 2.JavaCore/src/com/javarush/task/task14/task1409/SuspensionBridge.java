package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge {
    public static final int count = 15;
    @Override
    public int getCarsCount() {
        return count;
    }
}
