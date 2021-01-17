package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Review {

	
		private double rating;
	private String reviewerName;
	private String location;
		
	
}
