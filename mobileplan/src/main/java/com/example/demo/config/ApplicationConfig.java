package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.CallHistory;
import com.example.demo.model.Customer;
import com.example.demo.model.MobileBill;
import com.example.demo.model.MobilePlan;


@Configuration
public class ApplicationConfig {

	
	@Bean
	@Primary
	public MobilePlan postPaidPlan()
	{
		return new MobilePlan(101,"Family Pack",60, new String[] {"unlimited calls","Unlimited data"}, 500);
	}
	
//	@Bean
//	public MobilePlan prePaidPlan()
//	{
//		MobilePlan prePaidPlan =new MobilePlan();
//		prePaidPlan.setId(102);
//		prePaidPlan.setPlanName("Office Plan");
//		prePaidPlan.setValidity(51);
//		prePaidPlan.setFeatures(new String[]{"unlimited calls"});
//        prePaidPlan.setAmount(400);
//        return prePaidPlan;
//	}
	
//	@Bean
//	public Customer getCustomer()
//	{
//		Customer customer1=new Customer("Nikhil", 22);
//		return customer1;
//		
//	}
	
	@Bean
	public CallHistory callHistory1()
	{
		return new CallHistory("150", 3.0, 5.0, "Local");
	}
	
	
	@Bean
	public CallHistory callHistory2()
	{
		return new CallHistory("152", 4.0, 5.0, "Local");
	}
	
	@Bean
	public MobileBill getBill()
	{
		MobileBill bill=new MobileBill();
		bill.setCustomer(new Customer("Niki", 22));
		return bill;
	}
}
	


