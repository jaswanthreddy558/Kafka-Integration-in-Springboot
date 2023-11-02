package com.example.kafka.model;

import lombok.Data;

@Data
public class KafkaMessage {
    private int id;
    private String name;
    private String email;
    private String contactNo;

}
