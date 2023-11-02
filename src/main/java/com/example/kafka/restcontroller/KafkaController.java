package com.example.kafka.restcontroller;

import com.example.kafka.model.KafkaMessage;
import com.example.kafka.consumer.producer.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity sendMessage(@RequestBody KafkaMessage kafkaMessages) throws Exception {
        try {
            messageProducer.sendMessage(kafkaMessages);
            LOGGER.info("Message sent successfully: {}", kafkaMessages);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error("Error sending the message: {}", e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }
}
