package com.mycompany.commons;

import com.mycompany.commons.Vehicle;

public class Car extends Vehicle {
    private String brand = null;

    public Car(String br, String nokgs) {
        super("asdf", "few");
        System.out.println("ini Car");
        this.brand = br;
    }
}