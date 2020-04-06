package com.project.systems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.systems.model.Driver;
import com.project.systems.service.DriverService;

@RestController
@RequestMapping("drivers")
public class DriverController {

	@Autowired
	private DriverService driverService;

	@RequestMapping
	public List<Driver> getDrivers() {
		return driverService.findAll();
	}

	@RequestMapping("/{id}")
	public Driver getDriverwithId(@PathVariable("id") String driverId) {
		return driverService.find(driverId);

	}

	@RequestMapping(method = RequestMethod.POST)
	public Driver createDriver(Driver driver) {
		return driverService.createDriver(driver);
	}

}
