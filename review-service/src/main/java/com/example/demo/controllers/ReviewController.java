package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Review;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
private Map<String, String> hashMap;

 public ReviewController(Map<String, String> hashMap) {
	 super();
	 this.hashMap=new HashMap<>();
	 hashMap.put("bangalore", "nik");
	 hashMap.put("tumkur", "tom");
	
}
	@Autowired
	private Review entity;
	
	@GetMapping(path="/reviews/{name}")
	public Review getReview(@PathVariable("name") String reviewrName) throws InterruptedException
	{
	if(reviewrName.equalsIgnoreCase("nikhil"))
	{
		entity.setLocation("bangalore");
		entity.setRating(4.5);
		entity.setReviewerName("Sham");
	}
	else
	{
		Thread.sleep(6000);
		entity.setRating(4.2);
		entity.setReviewerName("Alex");
	}
	return entity;
	}
	
	@GetMapping(path = "/reviews/top/{location}")
	public String getTopReviewerByLocation(@PathVariable("location") String location) throws Exception
	{
		String reviewerName=null;
		if(this.hashMap.containsKey(location))
		{
			reviewerName=hashMap.get(location);
		}
		else
		{
			throw new IllegalArgumentException();
		}
		return reviewerName;
		}
	}

