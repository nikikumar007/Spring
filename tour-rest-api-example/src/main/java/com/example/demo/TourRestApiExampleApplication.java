package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Tour;
import com.example.demo.repos.TourRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class TourRestApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourRestApiExampleApplication.class, args);
		
		
	}
	
	@Bean
	public CommandLineRunner runner()
	{
		return new CommandLineRunner() {
			
			@Autowired
			TourRepository repo;
			
			@Override
			public void run(String... args) throws Exception{
				repo.save(new Tour(103,"Hampi",2,3000));
				
				
				
			}
			
			
		};
	}

}
