package com.mycompany.commons;

public class Fungs {
    private int number = 0;
    private String firstName = null;
    private String lastName = null;
    private int birthYear = 0;

    public Fungs() {
        System.out.println("testing Fungs without parameter");
    }

    public Fungs(int theNumber) {
        this.number = theNumber;
        System.out.println("teesting Fungs with parameter 1");
        System.out.println(number);
    }

    public Fungs(String first, String last, int year) {
        firstName = first;
        System.out.println(firstName);
        lastName = last;
        System.out.println(lastName);
        birthYear = year;
        System.out.println(birthYear);
    }
}