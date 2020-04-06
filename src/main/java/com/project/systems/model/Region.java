package com.project.systems.model;

public class Region {
	
	private String regionId;
	
	private UserType userType;

	public Region() {
		super();
	}

	public Region(String regionId, UserType userType) {
		super();
		this.regionId = regionId;
		this.userType = userType;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	

}
