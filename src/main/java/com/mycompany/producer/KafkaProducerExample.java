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
        System.out.println("Done adding createTopic!");
        logger.info("Done adding createTopic logger");
    }
}