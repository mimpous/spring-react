package com.packt.cardbase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardbaseApplication {
	
	private final static Logger LOGGER = LoggerFactory.getLogger( CardbaseApplication.class );

	public static void main(String[] args) {
		
		LOGGER.error("this is from springboot test");
		SpringApplication.run(CardbaseApplication.class, args);
	}

}
