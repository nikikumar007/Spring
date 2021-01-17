package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Tour;
import com.example.demo.repos.TourRepository;

@Service
public class TourService {

	@Autowired
	private TourRepository repo;
	
	public List<Tour> findAll()
	{
		return this.repo.findAll();
	}
	
	
	public Optional<Tour> findById(Integer id)
	{
		return this.repo.findById(id);
	}
	
	
//	   public void delete(int id) {
//	        repo.deleteById(id);
//	    }
//	
	
	public Tour deleteTour(Tour tour) {
		Tour deletedTour=null;
		if(this.repo.existsById(tour.getTourId()))
		{
			this.repo.deleteById(tour.getTourId());
		}
        return deletedTour;
    }

	   public Tour updateTour(Tour tour)
	   {
		   return this.addTour(tour);
	   }
	   
	public Tour addTour(Tour entity)
	{
		return this.repo.save(entity);
	}
			
}
