package com.mycompany.producer;

import com.mycompany.commons.Commons;

import kafka.admin.AdminUtils;
import kafka.admin.RackAwareMode;
import kafka.utils.ZKStringSerializer$;
import kafka.utils.ZkUtils;
import org.apache.logging.log4j.Logger;
import org.apache.kafka.clients.producer.Producer;
import org.apache.logging.log4j.LogManager;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkConnection;

import java.util.Properties;
import java.util.Random;

public class KafkaProducerExample {
    private static final Logger logger = LogManager
            .getLogger(KafkaProducerExample.class);

    public static void main(String... args) {
        createTopic();
        System.out.println("Done adding kafkaProducer!");
        logger.info("Done adding kafkaProducer logger");

        String[] words = new String[] { "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten" };
        Random ran = new Random(System.currentTimeMillis());

        final Producer<String, String> producer = createProducer();
    }

    private static Producer<String, String> createProducer() {
        System.out.println("masuk createProducer()");
        return null;
    }

    private static void createTopic() {
        int sessionTimeoutMs = 10 * 1000;
        int connectionTimeoutMs = 8 * 1000;

        ZkClient zkClient = new ZkClient(Commons.EXAMPLE_ZOOKEEPER_SERVER,
                sessionTimeoutMs, connectionTimeoutMs, ZKStringSerializer$.MODULE$);

        boolean isSecureKafkaCluster = false;
        ZkUtils zkUtils = new ZkUtils(zkClient,
                new ZkConnection(Commons.EXAMPLE_ZOOKEEPER_SERVER),
                isSecureKafkaCluster);

        int partitions = 1;
        int replication = 1;

        Properties topicConfig = new Properties();
        if (!AdminUtils.topicExists(zkUtils, Commons.EXAMPLE_KAFKA_TOPIC)) {
            AdminUtils.createTopic(zkUtils, Commons.EXAMPLE_KAFKA_TOPIC, partitions,
                    replication, topicConfig, RackAwareMode.Safe$.MODULE$);
            logger.info("Topic {} created.", Commons.EXAMPLE_KAFKA_TOPIC);
            System.out.printf("this Topic %s created.", Commons.EXAMPLE_KAFKA_TOPIC);
        } else {
            logger.info("Topic {} already exists.", Commons.EXAMPLE_KAFKA_TOPIC);
            System.out.printf("this Topic %s already exists.",
                    Commons.EXAMPLE_KAFKA_TOPIC);
        }

        zkClient.close();

        System.out.println("Done createTopic()!");
    }
}