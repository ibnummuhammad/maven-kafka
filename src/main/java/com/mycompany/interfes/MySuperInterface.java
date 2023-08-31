package com.mycompany.interfes;

public interface MySuperInterface {

    default public void saiHello() {
        System.out.println("saiHello new");
    };

}