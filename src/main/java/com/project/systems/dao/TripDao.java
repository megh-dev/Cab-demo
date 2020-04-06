package com.project.systems.dao;

import org.springframework.stereotype.Repository;

import com.project.systems.model.Trip;
@Repository
public class TripDao {
	
	
	public Trip find(String tripId) {
		return new Trip();	
	}
	
	public Trip createTrip(Trip trip) {
		return new Trip();
	}
}
 