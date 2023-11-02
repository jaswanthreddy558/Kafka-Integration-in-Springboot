package com.example.kafka.consumer;

import com.example.kafka.model.KafkaMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);
    public static final String CONSUMER_GROUP_ID = "${spring.kafka.consumer.group-id}";

    @KafkaListener(topics = "users", groupId = CONSUMER_GROUP_ID)
    public void listen(@Payload KafkaMessage kafkaMessage) {
        LOGGER.info("Message received ID : {} Message Contact Number: {} Message Email : {}",
                kafkaMessage.getId(), kafkaMessage.getContactNo(), kafkaMessage.getEmail());
    }
}
