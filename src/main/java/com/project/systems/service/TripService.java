package com.project.systems.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.systems.dao.TripDao;
import com.project.systems.model.LocationPoint;
import com.project.systems.model.Trip;

@Service
public class TripService {
	@Autowired
	private TripDao tripDao;
	
	public Trip fetch(String tripId) {
		return tripDao.find(tripId);	
	}
	
	public Trip createTrip(Trip trip) {
		trip.setDistanceToTravel(computeDistance(trip.getSourceLocationPoint(), trip.getDestinationLocationPoint()));
		trip.setTripDuration(computeDuration(trip.getSourceLocationPoint(), trip.getDestinationLocationPoint()));
		return tripDao.createTrip(trip);
	}

	private BigDecimal computeDuration(LocationPoint sourceLocationPoint, LocationPoint destinationLocationPoint) {
		// TODO Auto-generated method stub
		return null;
	}

	private BigDecimal computeDistance(LocationPoint sourceLocationPoint, LocationPoint destinationLocationPoint) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
