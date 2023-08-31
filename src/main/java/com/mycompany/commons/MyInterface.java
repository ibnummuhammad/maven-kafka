package com.mycompany.commons;

public interface MyInterface {

    public String hello = "Hello";
    int FALSE = 0;
    int TRUE = 1;

    public void sayHello();

    default public void sayNice() {
        System.out.println("ini sayNice");
    }

}