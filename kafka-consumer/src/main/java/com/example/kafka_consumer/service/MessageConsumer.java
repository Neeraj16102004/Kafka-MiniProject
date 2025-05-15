package com.example.kafka_consumer.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "user-activity", groupId = "my-consumer-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}

