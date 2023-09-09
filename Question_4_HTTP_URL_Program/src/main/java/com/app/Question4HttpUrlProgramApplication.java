package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Question4HttpUrlProgramApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(Question4HttpUrlProgramApplication.class, args);
		
		RestTemplate restTemplate = new RestTemplate();
		
	    String url = "http://127.0.0.1:8999/test?value=p";
	    
	    String response = restTemplate.getForObject(url, String.class);
	    
	    System.out.println("Response from the URL:");
	    
	    System.out.println(response);
		
	}
	
	

}
