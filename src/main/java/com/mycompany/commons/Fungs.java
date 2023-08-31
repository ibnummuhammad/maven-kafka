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

    public Fungs(String theString) {
        System.out.println(theString);
    }

    public Fungs(String first, String last, int year) {
        firstName = first;
        System.out.println(firstName);
        lastName = last;
        System.out.println(lastName);
        birthYear = year;
        System.out.println(birthYear);
    }

    public Fungs(String first, String last) {
        this(first, last, -1);
    }

    public String writeText(String text) {
        System.out.println(text); // prints the text parameter to System.out.
        System.out.println(this.firstName);

        return text;
    }

    public String concat(String string1, String string2) throws Exception {

        if (string1 == null) {
            throw new Exception("string1 was null");
        }
        if (string2 == null) {
            throw new Exception("string2 was null");
        }

        return string1 + string2;
    }
}