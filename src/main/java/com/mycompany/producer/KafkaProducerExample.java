package com.mycompany.producer;

import com.mycompany.commons.Commons;
import kafka.utils.ZKStringSerializer$;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
// import org.I0Itec.zkclient.ZkClient;

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

        // ZkClient zkClient = new ZKClient(Commons.EXAMPLE_ZOOKEEPER_SERVER,
        // sessionTimeoutMs, connectionTimeoutMs, ZKStringSerializer$.MODULE$);

        System.out.println("Done adding org.apache.kafka kafka_2.11 2.3.1!");
    }
}