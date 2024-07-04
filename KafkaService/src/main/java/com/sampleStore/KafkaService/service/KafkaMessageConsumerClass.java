package com.sampleStore.KafkaService.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageConsumerClass {
	
@KafkaListener(topics = "test_topic", groupId = "group_id") 
public void
consume(String message) 
{ 
 // Print statement 
 System.out.println("Hello Waiting For Kafka Message"); 
 System.out.println("message = " + message); 
 System.out.println("Got Kakfka Message And Consumed"); 
} 

}
