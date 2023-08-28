package main.java.com.mycompany.commons;

public class Commons {
    public final static String EXAMPLE_KAFKA_TOPIC = System
            .getenv("EXAMPLE_KAFKA_TOPIC") != null
                    ? System.getenv("EXAMPLE_KAFKA_TOPIC")
                    : "example";
}