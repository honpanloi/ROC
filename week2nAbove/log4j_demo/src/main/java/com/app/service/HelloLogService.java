package com.app.service;

import org.apache.log4j.Logger;

public class HelloLogService {
	
	private static Logger log = Logger.getLogger(HelloLogService.class);
	
	public void helloLog() {
		log.info("Hello from log service helloLog();");
		log.info("Bye bye from log service helloLog();");
	}

}
