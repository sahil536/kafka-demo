package com.sampleStore.KafkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sampleStore.KafkaService.service.KafkaMessageProducerClass;

@RestController
public class CommonController {
	
	@Autowired
	private KafkaMessageProducerClass kafkaMessageProducerSampleClass;
	
    @GetMapping("publish/{message}") 
    public String publish_message( 
        @PathVariable("message") String message) 
    { 
    	kafkaMessageProducerSampleClass.sendMessageToTopic(message);
        return "Message Published on Kafka !"; 
    }

	
	
	
	@GetMapping("/")
	public String demo() {
		
		return "index";
	}
	

	  
	   
	  


}
