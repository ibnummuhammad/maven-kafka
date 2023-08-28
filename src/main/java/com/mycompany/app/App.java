package com.mycompany.app;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        String EXAMPLE_GOAL = System.getenv("EXAMPLE_GOAL") != null
                ? System.getenv("EXAMPLE_GOAL")
                : "producer";

        logger.info("Kafka Topic:");
        System.out.println("Done!");
    }
}
