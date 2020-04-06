package com.project.systems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.systems.dao.RegionDao;
import com.project.systems.model.Location;
import com.project.systems.model.Region;

@Service
public class RegionService {
	
	@Autowired
	private RegionDao regionDao;

	public List<Region> fetchRegions(Location location) {
		// TODO Auto-generated method stub
		return regionDao.fetchRegions(location);
	}

}
