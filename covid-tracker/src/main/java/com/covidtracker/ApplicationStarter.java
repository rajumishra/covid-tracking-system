package com.covidtracker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationStarter {
	
	public static void main(String[] args) {
		
		SpringApplication.run(ApplicationStarter.class, args);	
	}  

}
