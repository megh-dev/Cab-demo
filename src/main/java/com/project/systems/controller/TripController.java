package com.project.systems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.systems.model.Trip;
import com.project.systems.service.TripService;

@RestController
@RequestMapping("trips")
public class TripController {
	
	@Autowired
	private TripService tripService;
	
	
	@RequestMapping("/{id}")
	public Trip getTrip(@PathVariable("id") String tripId) {
		return tripService.fetch(tripId);	
	}
	
	@RequestMapping(method =RequestMethod.POST)
	public Trip createTrip(Trip trip) {
		return tripService.createTrip(trip);	
	}

}
