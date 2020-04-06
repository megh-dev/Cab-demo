package com.project.systems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.systems.dao.DriverDao;
import com.project.systems.model.Driver;
@Service
public class DriverService {
	
	@Autowired
	private DriverDao driverDao;
	
	public List<Driver> findAll() {
		
		return driverDao.findAll();		
	}
	
	public Driver find(String driverId) {
		return driverDao.find(driverId);
	}
	
	public Driver createDriver(Driver driver) {
		return driverDao.createDriver(driver);
	}
	
	public Driver fetchDriverNearRegion(String id) {
		List<Driver> drivers = driverDao.findAll();
		
		return fetchDriverNearBy(drivers,id);
	}


	private Driver fetchDriverNearBy(List<Driver> drivers, String id) {
		return null;
		// TODO Auto-generated method stub
		
	}
	
}
