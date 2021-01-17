package com.training.apps;

import javax.xml.ws.Endpoint;

import com.training.service.MovieRatingServiceImpl;

public class Application {
public static void main(String[] args) {
	Endpoint.publish("http://localhost:7575/review", new MovieRatingServiceImpl());
	System.out.println("Service Published");
}
}
