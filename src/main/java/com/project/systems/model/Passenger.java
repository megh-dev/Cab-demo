package com.project.systems.model;

public class Passenger extends User{
	
	private String email;

	public Passenger() {
		super();
	}

	public Passenger(String userId, String name, String contactDetails,String email) {
		super(userId, name, contactDetails);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
