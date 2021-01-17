package com.example.demo.services;

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
	
	public Tour addTour(Tour entity)
	{
		return this.repo.save(entity);
	}
	
	public Optional<Tour> findByTourId(Integer id){
		return this.repo.findById(id);
	}
	
	/*public Tour deleteTour(Integer id) {
		Tour deletedTour=null;
		if(repo.existsById(id)) {
			repo.deleteById(id);
			deletedTour=this.repo.findBy;
			
		}
		return deletedTour;
	}*/
	
	 public Tour updateTour(Tour tour) {
	    	
	    	return this.addTour(tour);    	
	    }
	    
	   
	     //custom query-using findByxxx
	    public List<Tour> findByName(String name) {
	    	return this.repo.findByTourName(name);
	    }
	    
	    //custom query-using findByxxx
	    public List<Tour> greaterThanDuration(double duration){
	    	return this.repo.findByDurationGreaterThan(duration);
	    }
	    
	    //custom query-using 
	    public List<Tour> findByCost(double cost)
	    {
	    	return this.repo.findToursByCost(cost);
	    }
	    
	    public int updateTour(int id,double revised){
	    	return this.repo.updateTour( id,revised);
	    }

}
