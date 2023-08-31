package com.mycompany.producer;

import com.mycompany.commons.Commons;

import kafka.admin.AdminUtils;
import kafka.admin.RackAwareMode;
import kafka.utils.ZkUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkConnection;

import java.util.Properties;

public class KafkaProducerExample {
    private static final Logger logger = LogManager
            .getLogger(KafkaProducerExample.class);

    public static void main(String... args) throws Exception {
        createTopic();
        System.out.println("Done adding kafkaProducer!");
        logger.info("Done adding kafkaProducer logger");
    }

    private static void createTopic() throws Exception {
        int sessionTimeoutMs = 10 * 1000;
        int connectionTimeoutMs = 8 * 1000;

        ZkClient zkClient = new ZkClient(
                Commons.EXAMPLE_ZOOKEEPER_SERVER,
                sessionTimeoutMs,
                connectionTimeoutMs);
        System.out.println("ini zkClient");
        System.out.println(zkClient);

        boolean isSecureKafkaCluster = false;
        ZkUtils zkUtils = new ZkUtils(zkClient, new ZkConnection(Commons.EXAMPLE_ZOOKEEPER_SERVER),
                isSecureKafkaCluster);
        System.out.println("ini zkUtils");
        System.out.println(zkUtils);

        int partitions = 1;
        int replication = 1;

        Properties topicConfig = new Properties();
        System.out.println("ini Topic");
        if (!AdminUtils.topicExists(zkUtils, Commons.EXAMPLE_KAFKA_TOPIC)) {
            AdminUtils.createTopic(zkUtils, Commons.EXAMPLE_KAFKA_TOPIC, partitions, replication, topicConfig,
                    RackAwareMode.Safe$.MODULE$);
            logger.info("Topic {} created.", Commons.EXAMPLE_KAFKA_TOPIC);
            System.out.printf("this Topic %s created.", Commons.EXAMPLE_KAFKA_TOPIC);
        } else {
            logger.info("Topic {} already exists.", Commons.EXAMPLE_KAFKA_TOPIC);
            System.out.printf("this Topic %s already exists.", Commons.EXAMPLE_KAFKA_TOPIC);
        }

        zkClient.close();

        System.out.println("Done add ZkUtils!");
    }
}