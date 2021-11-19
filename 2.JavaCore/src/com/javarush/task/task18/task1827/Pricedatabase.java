package com.javarush.task.task18.task1827;

public class Pricedatabase {
    private int id;
    private String therest;

    public Pricedatabase(int id, String therest) {
        this.id = id;
        this.therest = therest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTherest() {
        return therest;
    }

    public void setTherest(String therest) {
        this.therest = therest;
    }
}
