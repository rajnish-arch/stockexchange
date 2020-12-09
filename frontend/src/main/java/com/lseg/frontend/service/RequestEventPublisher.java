package com.lseg.frontend.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RequestEventPublisher {

	private static final String TOPIC = "request-topic";
	private static final Logger logger = LoggerFactory.getLogger(RequestEventPublisher.class);
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String message) {

		logger.info(
				"*******************************************************Publishing messgage to request-topic*************************************");

		this.kafkaTemplate.send(TOPIC, "sql", message);

	}

	@Bean
	public NewTopic adviceTopic() {
		return new NewTopic("request-topic", 3, (short) 1);
	}

}
