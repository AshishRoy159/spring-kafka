package ml.bootcode.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaComsumerService {

	@KafkaListener(topics = "bootcode", groupId = "bootcode")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}
}
