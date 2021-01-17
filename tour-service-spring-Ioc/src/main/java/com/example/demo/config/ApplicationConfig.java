package com.example.demo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Address;
import com.example.demo.model.Tour;
import com.example.demo.model.TourAgent;

@Configuration
public class ApplicationConfig {

	@Bean
	//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	//@Lazy
	public Tour thailandTour()
	{
		System.out.println("Factory Method Called");
		return new Tour(101, "Thailand", 4, 45000);
	}
	
	@Bean
	public Tour koluTour()
	{
		return new Tour(102, "Kolu", 4, 50000);
	}
	
	
	@Bean
	public Tour nainitalTour()
	{
		return new Tour(102, "Nainital", 2, 60000);
	}
	
	@Bean
	public TourAgent agent007()
	{
		TourAgent agent7=new TourAgent();
		agent7.setId(150);
		agent7.setAgentName("niki");
		return agent7;
		
	}
	@Bean
	public Address residence() {
		return new Address("874", "2 cross", "Bangalore", 560032);
		
	}
	
	@Bean
	public Address office() {
		return new Address("541", "7 cross", "Bangalore", 560059);
		
	}
}
