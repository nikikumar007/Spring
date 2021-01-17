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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Tour;
import com.example.demo.service.TourService;

@RestController
public class TourContoller {

	@Autowired
	private TourService service;
	
	@GetMapping(path="/api/v1/tours")
	public List<Tour> findAll()
	{
		return this.service.findAll();
	}
	
	@GetMapping(path="/api/v1/tours/{id}")
	public Optional<Tour> findById(@PathVariable Integer id)
	{
		Optional<Tour> found= this.service.findById(id);
		return found;
	}
	
	@DeleteMapping(path = "/api/v1/tours/delete")
	public ResponseEntity<Tour> removeTour(@RequestBody Tour tour)
	{
		Tour deletedTour=this.service.deleteTour(tour);
		if(deletedTour!=null)
		{
			return ResponseEntity.status(200).body(deletedTour);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
		
		@PutMapping(path = "/api/v1/tours/delete")
		@ResponseStatus(value = HttpStatus.OK)
		public Tour updateTour(Tour tour)
		{
			return this.service.updateTour(tour);
		}
		
		
	@PostMapping(path = "/api/v1/tours")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Tour addTour(@RequestBody Tour tour)
	{
		return this.service.addTour(tour);
	}
}
