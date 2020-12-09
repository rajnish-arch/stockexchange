package com.lseg.domainservice.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.lseg.domainservice.error.ErrorResponse;
import com.lseg.domainservice.model.IssuerInfo;


@Service
public class EventListner {
	
	private static final Logger logger = LoggerFactory.getLogger(EventListner.class);
	@Autowired 
	EventProducer producer;		
	

	@Autowired
	SearchService service;
	
	@KafkaListener(topics= "request-topic",groupId= "group_id")
	public void consume(String message) throws IOException, InterruptedException {
		logger.info(String.format("$$$$$$$$$$$$$$$$$$$$$$$$$$$$ message received from consumer service -> %s", message));
		

		// Provide list of issuerName Info
	
			List<IssuerInfo> issuerList = new ArrayList<>();
			try {
				issuerList = service.getIssuerInfoByIssuerName(message);
				
			} catch (Exception e) {
				ErrorResponse error = new ErrorResponse();
				error.setCode("LSEG-00329-1001");
				error.setDescription("The given issuerName is invalid");
				error.setResolution("Please contact client services");
			}
			
		
		
	
		producer.sendMessage(issuerList);
	}
	

}

