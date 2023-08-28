package com.mycompany.app;

import com.mycompany.commons.Commons;
import com.mycompany.producer.KafkaProducerExample;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        String EXAMPLE_GOAL = System.getenv("EXAMPLE_GOAL") != null
                ? System.getenv("EXAMPLE_GOAL")
                : "producer";

        logger.info("Kafka Topic: {}", Commons.EXAMPLE_KAFKA_TOPIC);
        logger.info("Kafka Server: {}", Commons.EXAMPLE_KAFKA_SERVER);
        logger.info("Zookeeper Server: {}", Commons.EXAMPLE_ZOOKEEPER_SERVER);
        logger.info("GOAL: {}", EXAMPLE_GOAL);

        switch (EXAMPLE_GOAL.toLowerCase()) {
        case "producer":
            logger.info("producer logger");
            System.out.println("producer println");
            KafkaProducerExample.main();
        default:
            logger.error("No valid goal to run.");
            break;
        }

        System.out.println("Done adding Commons!");
    }
}
