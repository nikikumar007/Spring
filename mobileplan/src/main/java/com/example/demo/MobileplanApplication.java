package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.MobileBill;
import com.example.demo.model.MobilePlan;

@SpringBootApplication
public class MobileplanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(MobileplanApplication.class, args);
//		MobilePlan postPaid=ctx.getBean("postPaidPlan", MobilePlan.class);
//		System.out.println(postPaid);
//		System.out.println("Discount= " +postPaid.findDiscount());
//		System.out.println("------");
//		
//		MobilePlan prePaid=ctx.getBean("prePaidPlan", MobilePlan.class);
//		System.out.println(prePaid);
//		System.out.println("Discount= " +prePaid.findDiscount());
		
		MobileBill bill=ctx.getBean("getBill",MobileBill.class);
		System.out.println(bill);
		
		ctx.close();
	}

}
