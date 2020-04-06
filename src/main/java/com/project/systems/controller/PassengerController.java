package com.project.systems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.systems.model.Passenger;
import com.project.systems.service.PassengerService;

@RestController
@RequestMapping("passengers")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	@RequestMapping
	public List<Passenger> getPassengers() {
		
		return passengerService.findAll();
		
	}
	
	@RequestMapping("/{id}")
	public Passenger getPassengerwithId(@PathVariable("id") String passengerId) {
		return passengerService.find(passengerId);
		
	}
	
	@RequestMapping(method =RequestMethod.POST)
	public Passenger createTrip(Passenger passenger) {
		return passengerService.createPassenger(passenger);	
	}
	

}
