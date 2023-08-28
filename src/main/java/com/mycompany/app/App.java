package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String EXAMPLE_GOAL = System.getenv("USER");
        System.out.println("Hello World!");
        System.out.println(EXAMPLE_GOAL);
        System.out.println("Done!");
    }
}
