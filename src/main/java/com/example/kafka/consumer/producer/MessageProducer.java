package com.example.kafka.consumer.producer;

import com.example.kafka.model.KafkaMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class MessageProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "users";

    public void sendMessage(@RequestBody KafkaMessage message) throws Exception {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonMessage = objectMapper.writeValueAsString(message);
            ListenableFuture<SendResult<String, String>> resultListenableFuture = kafkaTemplate.send(TOPIC, jsonMessage);
            LOGGER.info("Produce Record Value {}", resultListenableFuture.get().getProducerRecord().value());


        } catch (JsonProcessingException e) {

        }


    }
}
