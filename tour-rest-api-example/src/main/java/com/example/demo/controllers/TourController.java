package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Tour;
import com.example.demo.services.TourService;



@RestController
@RequestMapping("/api/v1/")
public class TourController {
	
	@Autowired
	private TourService service;
	
	@GetMapping(path="tours")
	public List<Tour> findAll()
	{
		return this.service.findAll();
	}
	
	@PostMapping(path="tours")
	@ResponseStatus(value=HttpStatus.CREATED)
	public Tour addTour(@RequestBody Tour tour)
	{
		return this.service.addTour(tour);
		
	}
	
	@GetMapping(path="tours/{id}")
	public Optional<Tour> findByTourId(@PathVariable("id") Integer id)
	{
		return this.service.findByTourId(id);
	}
	
	

	
	/*
	@DeleteMapping(path ="/api/v1/tours/{id}")
	@ResponseStatus(value=HttpStatus.CREATED)
	public int delete(@PathVariable Integer id) {
		Optional<Tour> tour=this.service.findByTourId(id);
		if(tour.isPresent()) {
			return this.service.deleteTour(id);
		}
		else
			return 0;
		
	}*/
	
	@PutMapping(path ="tours")
	@ResponseStatus(value=HttpStatus.CREATED)
	public int update(@RequestBody Tour entity) {
		Optional<Tour> tour=this.service.findByTourId(entity.getTourID());
		if(tour.isPresent()) {
			this.service.addTour(entity);
			return 1;
		}
		else
			return 0;
	}

	@GetMapping(path="tours/tourName/{name}")
	public List<Tour> findByName(@PathVariable("name") String tourName){
		return this.service.findByName(tourName);
	}
	
	@GetMapping(path="tours/duration/{days}")
	public List<Tour> findByDuration(@PathVariable("days") double duration){
		return this.service.greaterThanDuration(duration);
	}
	

	@GetMapping(path="tours/cost/{inr}")
	public List<Tour> findByCost(@PathVariable("inr") double cost){
		return this.service.findByCost(cost);
	}
	
	@PutMapping(path="tours/cost/{tourID}/{revised}")
	public ResponseEntity<String> updateCost(@PathVariable("tourID") int tourID,@PathVariable("revised") double cost){
		String msg= "Rows updated:="+this.service.updateTour(tourID,cost);
		return ResponseEntity.ok().body(msg);
	}


}
