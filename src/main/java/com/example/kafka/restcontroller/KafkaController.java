package com.example.kafka.restcontroller;

import com.example.kafka.model.KafkaMessage;
import com.example.kafka.producer.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class KafkaController {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("/send")
    public void sendMessage(@RequestBody KafkaMessage kafkaMessages) {
        messageProducer.sendMessage(kafkaMessages);
            LOGGER.info("Successfully Message Sent to ");

    }
}
