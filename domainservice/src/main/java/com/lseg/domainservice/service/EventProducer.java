package com.lseg.domainservice.service;

import java.io.IOException;
import java.util.List;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.lseg.domainservice.model.IssuerInfo;

@Service
public class EventProducer {

	private static final String TOPIC = "response-topic";
	private static final Logger logger = LoggerFactory.getLogger(EventProducer.class);
	@Autowired
	private KafkaTemplate kafkaTemplate;

	public void sendMessage(List<IssuerInfo> issuerList) throws IOException, InterruptedException {

		logger.info(
				"*******************************************************Publishing message to response-topic *************************************");
		/*
		 * for (IssuerInfo info : issuerList) {
		 * 
		 * System.out.println(info); }
		 */
		Thread.sleep(50000);

		this.kafkaTemplate.send(TOPIC, issuerList.toString());

	}

	@Bean
	public NewTopic adviceTopic() {
		return new NewTopic("response-topic", 3, (short) 1);
	}

}
