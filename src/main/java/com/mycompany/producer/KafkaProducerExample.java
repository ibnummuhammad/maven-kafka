package com.mycompany.producer;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class KafkaProducerExample {
    private static final Logger logger = LogManager
            .getLogger(KafkaProducerExample.class);

    public static void main(String... args) {
        createTopic();
        System.out.println("Done adding kafkaProducer!");
        logger.info("Done adding kafkaProducer logger");
    }

    private static void createTopic() {
        int sessionTimeoutMs = 10 * 1000;
        int connectionTimeoutMs = 8 * 1000;

        System.out.println(sessionTimeoutMs);
        System.out.println(connectionTimeoutMs);

        System.out.println("Done adding createTopic!");
        logger.info("Done adding createTopic logger");
    }
}