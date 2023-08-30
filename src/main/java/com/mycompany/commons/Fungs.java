package com.mycompany.commons;

public class Fungs {
    private int number = 0;

    public Fungs() {
        System.out.println("testing Fungs without parameter");
    }

    public Fungs(int theNumber) {
        this.number = theNumber;
        System.out.println("teesting Fungs with parameter 1");
        System.out.println(number);
    }
}