package com.project.systems.model;

public class Location {
	
	private String locationId;
	
	private String country;
	
	private String state;
	
	private String pincode;

	public Location() {
		super();
	}

	public Location(String locationId, String country, String state, String pincode) {
		super();
		this.locationId = locationId;
		this.country = country;
		this.state = state;
		this.pincode = pincode;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
