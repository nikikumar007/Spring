package com.training.service;

import javax.jws.WebService;

import com.training.ifaces.RatingService;
@WebService(endpointInterface = "com.training.ifaces.RatingService")
public class MovieRatingServiceImpl implements RatingService {

	@Override
	public double findRating(String movieName) {
		double rating=4.7;
		if(movieName.equals("Shivaji"))
		{
			rating=4.9;
		}
		return rating;
	}

}
