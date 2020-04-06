package com.project.systems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.systems.model.Location;
import com.project.systems.model.Region;
import com.project.systems.service.RegionService;

@RestController
@RequestMapping("regions")
public class RegionController {
	
	@Autowired
	private RegionService regionService;

	@RequestMapping
	public List<Region> getRegion(Location location) {
		return regionService.fetchRegions(location);
	}

}
