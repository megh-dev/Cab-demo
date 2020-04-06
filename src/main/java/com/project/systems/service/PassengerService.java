package com.project.systems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.systems.dao.PassengerDao;
import com.project.systems.model.Passenger;
@Service
public class PassengerService {
	@Autowired
	private PassengerDao passengerDao;
	
	public List<Passenger> findAll() {
		
		return passengerDao.findAll();		
	}
	
	public Passenger find(String passengerId) {
		return passengerDao.find(passengerId);
	}
	
	public Passenger createPassenger(Passenger passenger) {
		return passengerDao.createPassenger(passenger);
	}
}
