package com.sampleStore.KafkaService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageProducerClass {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	static final String TOPIC = "test_topic"; 
	
	public void sendMessageToTopic(String message) {
		System.out.println("Going TO Produce Kafka Message");
	    kafkaTemplate.send(TOPIC, message); 
	    System.out.println("Message Published on Kafka !");
	}

}
