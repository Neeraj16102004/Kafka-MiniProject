package com.example.kafka_producer.controller;



import com.example.kafka_producer.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageProducer producer;

    @PostMapping
    public String sendMessage(@RequestParam String message) {
        producer.sendMessage(message);
        return "Message sent to Kafka topic";
    }
}

