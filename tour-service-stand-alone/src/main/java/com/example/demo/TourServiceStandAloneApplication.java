package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class TourServiceStandAloneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(TourServiceStandAloneApplication.class, args);
		RestTemplate template = ctx.getBean(RestTemplate.class);
		String response = template.getForObject("http://TOUR-SERVICE/api/v1/tours/", String.class);
		System.out.println(response);

	}

	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}

}