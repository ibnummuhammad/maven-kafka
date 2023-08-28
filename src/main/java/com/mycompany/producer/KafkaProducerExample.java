package com.mycompany.producer;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class KafkaProducerExample {
    private static final Logger logger = LogManager
            .getLogger(KafkaProducerExample.class);

    public static void main(String... args) {
        System.out.println("kafkaproducer println");
        logger.info("kafkaProducer logger");

        System.out.println("Done adding kafkaProducer!");
    }
}