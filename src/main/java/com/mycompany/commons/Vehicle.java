package com.mycompany.commons;

public class Vehicle {
    private String regNo = null;
    private String regAngka = null;

    public Vehicle(String no) {
        this.regNo = no;
    }

    public Vehicle(String nomor, String angka) {
        System.out.println("ini vehicle");
        this.regNo = nomor;
        this.regAngka = angka;
    }
}