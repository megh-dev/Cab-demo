package com.project.systems.model;

public class LocationPoint extends Location {
	
	private String locationPointId;

	private String pointName;

	public LocationPoint() {
		super();
	}

	public LocationPoint(String locationPointId, String pointName) {
		super();
		this.locationPointId = locationPointId;
		this.pointName = pointName;
	}

	public String getLocationPointId() {
		return locationPointId;
	}

	public void setLocationPointId(String locationPointId) {
		this.locationPointId = locationPointId;
	}

	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	
	
	
}
