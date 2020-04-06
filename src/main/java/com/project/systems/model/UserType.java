package com.project.systems.model;

public enum UserType {
	
	PASSENGER("passenger"),DRIVER("driver");
	
	private String type;

	private UserType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
