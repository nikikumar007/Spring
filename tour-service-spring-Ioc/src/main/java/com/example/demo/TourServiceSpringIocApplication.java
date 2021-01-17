package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Tour;
import com.example.demo.model.TourAgent;

@SpringBootApplication
public class TourServiceSpringIocApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(TourServiceSpringIocApplication.class, args);
//		Tour tour=ctx.getBean("tour", Tour.class);
//		System.out.println(tour);
//		
//		
//		Tour thaiTour=ctx.getBean("thailandTour", Tour.class);
//		System.out.println(thaiTour);
//		ctx.close();
//		
//		
//
//		Tour thaiTour1=ctx.getBean("thailandTour", Tour.class);
//		System.out.println(thaiTour1);
//		
//		System.out.println("Is Singleton= " +ctx.isSingleton("thailandTour"));
	//	System.out.println("Is Singleton= " +ctx.isPrototype("thailandTour"));
 TourAgent agent7=ctx.getBean(TourAgent.class);
 System.out.println(agent7.getAgentName());
 System.out.println(agent7.getId());
 agent7.getTours().forEach(System.out::println);
		System.out.println(agent7.getAddress());
	}

}
