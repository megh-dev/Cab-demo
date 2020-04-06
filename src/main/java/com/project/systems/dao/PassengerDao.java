package com.project.systems.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.systems.model.Passenger;
import com.project.systems.model.UserType;
@Repository
public class PassengerDao {
	
	
	public List<Passenger> findAll() {
		List<Passenger> Passengers = new ArrayList<Passenger>();
		Passengers.add(new Passenger("2","I am Passenger 2", UserType.PASSENGER.getType(),"passsenger2@gmail.com"));
		Passengers.add(new Passenger("3","I am Passenger 3", UserType.PASSENGER.getType(),"passsenger3@gmail.com"));
		return Passengers;		
	}
	
	public Passenger find(String passengerId) {
		return new Passenger(passengerId,"I am Passenger "+passengerId, UserType.PASSENGER.getType(),"passsenger"+passengerId+"@gmail.com");		
	}
	
	public Passenger createPassenger(Passenger Passenger) {
		return new Passenger();
	}

}
