package com.project.systems.dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.project.systems.model.Driver;
import com.project.systems.model.UserType;

@Repository
public class DriverDao {
	
	
	
	public List<Driver> findAll() {
		List<Driver> drivers = new ArrayList<Driver>();
		drivers.add(new Driver("2","I am driver 2", UserType.DRIVER.getType(),"DL-132019123456","OD123467"));
		drivers.add(new Driver("3","I am driver 3", UserType.DRIVER.getType(),"DL-132019123456","OD123467"));
		return drivers;		
	}
	
	public Driver find(String driverId) {
		return new Driver(driverId,"I am driver "+driverId, UserType.DRIVER.getType(),"DL-132019123456","OD123467");		
	}
	
	public Driver createDriver(Driver driver) {
		return new Driver();
	}

}
