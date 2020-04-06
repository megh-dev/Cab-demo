package com.project.systems.model;

public enum TripType {
	
	PICKUP("pickup"),DROP("DROP");
	
	private String type;

	private TripType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
