package com.mycompany.producer;

import com.mycompany.commons.MyInterfaceImpl;
import com.mycompany.interfes.MyOtherInterface;
import com.mycompany.interfes.MySubInterface;
import com.mycompany.commons.Commons;
import com.mycompany.commons.Fungs;
import com.mycompany.commons.MyInterface;
import kafka.utils.ZKStringSerializer$;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.I0Itec.zkclient.ZkClient;

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
                connectionTimeoutMs,
                ZKStringSerializer$.MODULE$);

        Fungs fungBar = new Fungs("iben", "ski", 789);
        System.out.println(fungBar.writeText("masuknih"));
        System.out.println(fungBar.concat("depan", "belakang"));
        System.out.println(MyInterface.hello);
        System.out.println("fungsString");

        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.sayHello();
        myInterface.sayNice();

        MyOtherInterface myOtherInterface = new MyInterfaceImpl();
        myOtherInterface.sayGoodbye();

        MyInterface.print("ini MyInterface print");

        MySubInterface mySubInterface = new MyInterfaceImpl();
        mySubInterface.saiGoodbye();
        mySubInterface.sayItAll();

        System.out.println("Done adding ZkClient!");
    }
}