package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MovieRatingServiceImplService obj=new MovieRatingServiceImplService();
RatingService service=obj.getMovieRatingServiceImplPort();
System.out.println(service.findRating("Shivaji"));
	}

}
