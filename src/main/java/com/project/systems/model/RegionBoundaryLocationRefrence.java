package com.project.systems.model;

public class RegionBoundaryLocationRefrence {
	private String id;
	
	private String locationId;
	
	private String regionId;

	public RegionBoundaryLocationRefrence() {
		super();
	}


	public RegionBoundaryLocationRefrence(String id, String locationId, String regionId) {
		super();
		this.id = id;
		this.locationId = locationId;
		this.regionId = regionId;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getLocationId() {
		return locationId;
	}


	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}


	public String getRegionId() {
		return regionId;
	}


	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
}
